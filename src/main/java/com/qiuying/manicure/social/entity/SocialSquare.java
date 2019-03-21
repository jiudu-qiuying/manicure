package com.qiuying.manicure.social.entity;
import java.time.LocalDateTime;
import com.qiuying.manicure.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 社交广场（发图功能）
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
@Data
public class SocialSquare extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 图片地址
     */
    private String imagePath;

    /**
     * 备注
     */
    private String remark;

    /**
     * 标签ID
     */
    private Integer labelId;

    /**
     * 发送人
     */
    private String wechatNumber;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 是否删除    0/否    1/是
     */
    private String isDelete;

    /**
     * 收藏数
     */
    private Integer collect;

    /**
     * 点赞数
     */
    private Integer praise;

    /**
     * 评论数
     */
    private Integer comment;

    /**
     * 分享数
     */
    private Integer share;

    /**
     * 消息状态     0/审核中      1/已通过
     */
    private String status;





}
