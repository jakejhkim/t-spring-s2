package com.wirebarley.sample.s2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jake on 2016. 5. 23..
 */
@Controller
public class RootController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
