package com.theironyard;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by PiratePowWow on 3/7/16.
 */
public class SpringController {
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(HttpSession session, String userName){
        session.setAttribute("userName", MicroblogSpringApplication.userMap.get(userName));
        return "redirect:/";
    }
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model, HttpSession session){
        model.addAttribute("name", session.getAttribute("userName"));
        return "home";
    }
    @RequestMapping(path = "/add-message", method = RequestMethod.POST)
    public String addMessage(Model model, HttpSession session, String text) {
        User user = (User) session.getAttribute("userName");
        user.messages.add(text);
        return "home";
    }
    @RequestMapping(path = "/delete-message", method = RequestMethod.POST)
    public String deleteMessage(Model model, HttpSession session) {
        User user = (User) session.getAttribute("userName");

        model.addAttribute("message", message);
        return "home";
    }
}
