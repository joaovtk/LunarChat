package org.github.lunar.lunarchat.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {
    @GetMapping("/hello")
    public String hello(Model model){
        return "index"; 
    }
}
