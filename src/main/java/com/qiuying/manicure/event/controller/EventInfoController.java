package com.qiuying.manicure.event.controller;


import com.qiuying.manicure.event.entity.EventInfo;
import com.qiuying.manicure.event.entity.EventInfoVo;
import com.qiuying.manicure.event.service.EventInfoService;
import com.qiuying.manicure.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.qiuying.manicure.base.BaseController;

import java.util.ArrayList;
import java.util.List;

import static com.qiuying.manicure.utils.JMockDataUtils.mock;


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
    public Result list() throws Exception {
        List<EventInfoVo> lists = new ArrayList<>();
        EventInfoVo mock = mock(EventInfoVo.class);
        mock.setImagePath("https://suiyueranzly.oss-cn-beijing.aliyuncs.com/wechat.jpg");
        lists.add(mock);
        mock = mock(EventInfoVo.class);
        mock.setImagePath("https://suiyueranzly.oss-cn-beijing.aliyuncs.com/wechat.jpg");
        lists.add(mock);
        return Result.successResult(lists);
    }

    @PutMapping("/add")
    public Result add(EventInfoVo eventInfo) throws Exception {
        return Result.successResult("添加成功！");
    }

    @DeleteMapping("/delete")
    public Result add(String id) throws Exception {
        return Result.successResult("删除成功！");
    }



}

