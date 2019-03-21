package com.qiuying.manicure.pay.entity;

import java.time.LocalDateTime;
import com.qiuying.manicure.base.BaseEntity;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 支付记录
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
@Data
public class PayRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 支付人
     */
    private String wechatNumber;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 支付金额
     */
    private Float payMoney;

    /**
     * 使用积分抵扣后支付金额
     */
    private Float discount;

    /**
     * 本次使用的积分
     */
    private Integer intergral;


}
