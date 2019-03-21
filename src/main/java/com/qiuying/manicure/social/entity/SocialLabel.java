package com.qiuying.manicure.social.entity;

import java.time.LocalDateTime;
import com.qiuying.manicure.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 标签
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
@Data
public class SocialLabel extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 上级分类ID（默认为0）
     */
    private Integer parentId;

    /**
     * 标签名
     */
    private String labelName;

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

    /**
     * 创建人ID
     */
    private String createUser;


}
