package com.qiuying.manicure.social.entity;

import java.time.LocalDateTime;
import com.qiuying.manicure.base.BaseEntity;
import lombok.Data;

/**
 * <p>
 * 收藏表
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
@Data
public class SocialCollect extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 收藏人
     */
    private String userId;

    /**
     * 收藏时间
     */
    private LocalDateTime createTime;

    /**
     * 收藏ID
     */
    private Integer socialId;


}
