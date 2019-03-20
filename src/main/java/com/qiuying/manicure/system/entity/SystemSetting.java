package com.qiuying.manicure.system.entity;

import com.qiuying.manicure.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统变量表
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-20
 */
@Data
public class SystemSetting extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 客服电话
     */
    private String phoneNumber;


}
