package com.wirebarley.sample.s2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jake on 2016. 5. 23..
 */
@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "/login";
    }
}
