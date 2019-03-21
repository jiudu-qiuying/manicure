package com.qiuying.manicure.social.entity;

import com.qiuying.manicure.base.BaseEntity;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * <p>
 * 标签
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
@Data
public class SocialLabelVo extends SocialLabel {

    private String createUserName;



}
