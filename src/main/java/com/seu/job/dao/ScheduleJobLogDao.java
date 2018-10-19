package com.seu.job.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.seu.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
}
