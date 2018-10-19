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
public class ChildCommentDto implements Serializable{

    private static final long serialVersionUID = 5061212992497947120L;

    private Long articleId;
    private Long parentId;

    public ChildCommentDto(Long articleId, Long id) {
        this.articleId=articleId;
        this.parentId=id;
    }
}
