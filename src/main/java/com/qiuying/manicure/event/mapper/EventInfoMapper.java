package com.qiuying.manicure.event.mapper;

import com.qiuying.manicure.event.entity.EventInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 最新活动表 Mapper 接口
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
@Mapper
public interface EventInfoMapper{

    @Select("select * from event_info")
    List<EventInfoVo> list();
}
