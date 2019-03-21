package com.qiuying.manicure.social.controller;


import com.qiuying.manicure.event.entity.EventInfoVo;
import com.qiuying.manicure.model.Result;
import com.qiuying.manicure.social.entity.SocialSquareVo;
import org.springframework.web.bind.annotation.*;

import com.qiuying.manicure.base.BaseController;

import java.util.ArrayList;
import java.util.List;

import static com.qiuying.manicure.utils.JMockDataUtils.mock;

/**
 * <p>
 * 社交广场（发图功能） 前端控制器
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
@RestController
@RequestMapping("/social/square")
public class SocialSquareController extends BaseController {

    @GetMapping("/list")
    public Result list() throws Exception {
        List<SocialSquareVo> lists = new ArrayList<>();
        SocialSquareVo mock = mock(SocialSquareVo.class);
        mock.setImagePath("https://suiyueranzly.oss-cn-beijing.aliyuncs.com/wechat.jpg");
        lists.add(mock);
        mock = mock(SocialSquareVo.class);
        mock.setImagePath("https://suiyueranzly.oss-cn-beijing.aliyuncs.com/wechat.jpg");
        lists.add(mock);
        return Result.successResult(lists);
    }


    @PutMapping("/add")
    public Result add(SocialSquareVo socialSquareVo) throws Exception {
        return Result.successResult("添加成功！");
    }

    @DeleteMapping("/delete")
    public Result add(String id) throws Exception {
        return Result.successResult("删除成功！");
    }

}

