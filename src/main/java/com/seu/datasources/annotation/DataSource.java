package com.seu.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 *
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}
