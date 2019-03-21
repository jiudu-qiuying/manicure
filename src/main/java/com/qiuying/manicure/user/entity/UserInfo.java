package com.qiuying.manicure.user.entity;

import java.time.LocalDateTime;
import com.qiuying.manicure.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 用户信息
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-20
 */
@Data
public class UserInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 微信号
     */
    private String wechatNumber;

    /**
     * 微信昵称
     */
    private String wechatName;

    /**
     * 手机号
     */
    private Integer phoneNumber;

    /**
     * 是否是管理员          1/管理员
     */
    private String isAdmin;

    /**
     * 当前积分
     */
    private Integer currentIntegral;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modifyTime;

    /**
     * 是否删除    0/否    1/是
     */
    private String isDelete;


}
