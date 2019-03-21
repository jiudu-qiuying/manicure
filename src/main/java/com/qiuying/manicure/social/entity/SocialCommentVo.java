package com.qiuying.manicure.social.entity;

import com.qiuying.manicure.base.BaseEntity;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 评论表
 * </p>
 *
 * @author zhangyq
 * @since 2019-03-19
 */
@Data
public class SocialCommentVo extends SocialComment {

    private String userName;



}
