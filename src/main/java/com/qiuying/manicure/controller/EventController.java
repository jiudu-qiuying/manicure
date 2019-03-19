package com.qiuying.manicure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyq
 */
@RestController
public class EventController {

    @GetMapping("/list")
    public String list() {
        return "hello";
    }
}
