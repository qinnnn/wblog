package com.seu.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class AuthorDto implements Serializable{
    private static final long serialVersionUID = 5059212992463947120L;

    private Long id;
    private String avatar;
    private String nickname;

    public AuthorDto(Long userId, String avatar, String nickname) {
        this.id=userId;
        this.avatar=avatar;
        this.nickname=nickname;
    }
}
