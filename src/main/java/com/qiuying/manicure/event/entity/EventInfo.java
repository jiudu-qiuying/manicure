package com.qiuying.manicure.event.entity;

import java.time.LocalDateTime;

import com.qiuying.manicure.base.BaseEntity;
import lombok.Data;

/**
 * <p>
 * 最新活动表
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
@Data
public class EventInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 活动ID
     */
    private Integer eventId;

    /**
     * 图片地址
     */
    private String imagePath;

    /**
     * 活动说明
     */
    private String remark;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 截止时间
     */
    private LocalDateTime endTime;

    /**
     * 置顶顺序
     */
    private Integer orderBy;

    /**
     * 是否删除    0/否    1/是
     */
    private String isDelete;


}
