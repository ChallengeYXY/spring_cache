package com.yangxinyu.app.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.yangxinyu.app.entity.Student;
import com.yangxinyu.app.mapper.StudentMapper;
import com.yangxinyu.app.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : 星宇
 * @since : 2023/05/08
 */
@Service
public class StudentServiceImpl extends BaseServiceImpl<StudentMapper, Student> implements StudentService {

    @Cacheable(cacheNames = "testCache")
    public List<Student> getAll(){
        System.out.println("没有缓存！");
        List<Student> students = this.baseMapper.selectList(Wrappers.lambdaQuery());
        return students;
    }
}
