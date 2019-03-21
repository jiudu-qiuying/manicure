package com.qiuying.manicure.social.entity;

import java.time.LocalDateTime;
import com.qiuying.manicure.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 邀请表
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
@Data
public class SocialInvite extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 邀请人
     */
    private String wechatNumber;

    /**
     * 加入人
     */
    private String joinUser;

    /**
     * 邀请时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 是否删除    0/否    1/是
     */
    private String isDelete;


}
