package com.yangxinyu.app.service;

import com.yangxinyu.app.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : 星宇
 * @since : 2023/05/08
 */
public interface StudentService {
    List<Student> getAll();
}
