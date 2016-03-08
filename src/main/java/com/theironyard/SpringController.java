package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by PiratePowWow on 3/7/16.
 */
@Controller
public class SpringController {
    @Autowired
    UserRepository users;
    @Autowired
    MessageRepository messages;

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(HttpSession session, String userName){
        session.setAttribute("user", users.findByName(userName));
        return "redirect:/";
    }
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model, HttpSession session){
        if (session.getAttribute("user")!= null ){
            model.addAttribute("messages", messages.findByUser((User) session.getAttribute("user")));
            model.addAttribute("user", session.getAttribute("user"));
        }
        return "home";
    }
    @RequestMapping(path = "/add-message", method = RequestMethod.POST)
    public String addMessage(HttpSession session, String text) {
        messages.save(new Message((User) session.getAttribute("user"),text));
        return "redirect:/";
    }
    @RequestMapping(path = "/delete-message", method = RequestMethod.POST)
    public String deleteMessage(int message) {
        messages.delete(message);
        return "redirect:/";
    }
    @RequestMapping(path = "/change-message", method = RequestMethod.POST)
    public String changeMessage(int id, String changeMessage){
        Message message = messages.findOne(id);
        message.setText(changeMessage);
        messages.save(message);
        return "redirect:/";
    }
}
