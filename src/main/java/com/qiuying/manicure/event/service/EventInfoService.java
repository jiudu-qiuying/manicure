package com.qiuying.manicure.event.service;


import com.qiuying.manicure.event.entity.EventInfoVo;

import java.util.List;

/**
 * <p>
 * 最新活动表 服务类
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
public interface EventInfoService  {

    /**
     * 获取所有活动
     * **/
    public List<EventInfoVo> list();

}
