package com.qiuying.manicure.integral.entity;

import com.qiuying.manicure.base.BaseEntity;
import lombok.Data;

/**
 * <p>
 * 积分变更记录
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
@Data
public class IntegralRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 记录人
     */
    private String userId;

    /**
     * 变更类型   0/增加    1/减少
     */
    private String type;

    /**
     * 积分数量
     */
    private Integer integralNum;

    /**
     * 备注
     */
    private String remark;


}
