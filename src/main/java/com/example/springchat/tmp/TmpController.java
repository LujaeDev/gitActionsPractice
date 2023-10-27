package com.example.springchat.tmp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TmpController {

    @GetMapping("/gitactions")
    String tmpC(){
        return "gitactions!";
    }
}
