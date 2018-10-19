package com.seu.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleArchivesVo {
    private String year;
    private String month;
    private Integer count;
}
