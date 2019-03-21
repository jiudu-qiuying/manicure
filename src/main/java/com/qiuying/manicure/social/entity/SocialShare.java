package com.qiuying.manicure.social.entity;

import java.time.LocalDateTime;
import com.qiuying.manicure.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 分享表
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
@Data
public class SocialShare extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 分享人
     */
    private String wechatNumber;

    /**
     * 分享时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 分享ID
     */
    private Integer socialId;


}
