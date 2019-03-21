package com.qiuying.manicure.social.entity;

import java.time.LocalDateTime;
import com.qiuying.manicure.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 点赞表
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
@Data
public class SocialPraise extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 点赞人
     */
    private String wechatNumber;

    /**
     * 点赞时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 点赞消息ID
     */
    private Integer socialId;


}
