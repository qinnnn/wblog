package com.seu.job.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.seu.job.entity.ScheduleJobEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 定时任务
 *
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
@Mapper
public interface ScheduleJobDao extends BaseMapper<ScheduleJobEntity> {

    /**
     * 批量更新状态
     */
    int updateBatch(Map<String, Object> map);

}
