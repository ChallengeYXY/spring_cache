package com.yangxinyu.app.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yangxinyu.app.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : 星宇
 * @since : 2023/05/08
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
