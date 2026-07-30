package web;

import hiber.model.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/user")
    public String userHome(@AuthenticationPrincipal User user, Model model){
        model.addAttribute("user", user);
        return "profile";
    }
}
