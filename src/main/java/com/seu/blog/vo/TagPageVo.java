package com.seu.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class TagPageVo {
    Integer offset;
    Integer pageSize;
    Integer tagId;

    public TagPageVo(Integer offset, Integer pageSize, Integer tagId) {
        this.offset=offset;
        this.pageSize=pageSize;
        this.tagId=tagId;
    }
}
