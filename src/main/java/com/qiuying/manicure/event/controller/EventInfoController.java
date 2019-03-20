package com.qiuying.manicure.event.controller;


import com.qiuying.manicure.event.service.EventInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.qiuying.manicure.base.BaseController;

/**
 * <p>
 * 最新活动表 前端控制器
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
@RestController
@RequestMapping("/event/info")
public class EventInfoController extends BaseController {

    @Autowired
    private EventInfoService eventInfoService;

    @GetMapping("/list")
    public String list() throws Exception {
        return "2";
    }

}

