package com.qiuying.manicure.social.entity;

import lombok.Data;

import java.util.List;

/**
 * @author zhangyq
 * @date 2019/3/20 20:07
 */
@Data
public class SocialSquareVo extends SocialSquare {

    private String labelName;

    private String wechatName;

    private List<SocialCommentVo> comments;

    private String statusText;

}
