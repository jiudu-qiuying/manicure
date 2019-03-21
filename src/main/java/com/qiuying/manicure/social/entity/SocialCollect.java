package com.qiuying.manicure.social.entity;

import java.time.LocalDateTime;
import com.qiuying.manicure.base.BaseEntity;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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
    private String wechatNumber;

    /**
     * 收藏时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 收藏ID
     */
    private Integer socialId;


}
