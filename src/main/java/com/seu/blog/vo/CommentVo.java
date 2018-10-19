package com.seu.blog.vo;

import com.seu.blog.entity.CommentEntity;

/**
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
public class CommentVo extends CommentEntity {

    private String avatar;
    private String nickname;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
