package com.qiuying.manicure.event.service.impl;

import com.qiuying.manicure.event.entity.EventInfoVo;
import com.qiuying.manicure.event.mapper.EventInfoMapper;
import com.qiuying.manicure.event.service.EventInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 最新活动表 服务实现类
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
@Service
public class EventInfoServiceImpl implements EventInfoService {

    @Autowired
    private EventInfoMapper eventInfoMapper;

    /**
     * 获取所有活动
     **/
    @Override
    public List<EventInfoVo> list() {
        return eventInfoMapper.list();
    }
}
