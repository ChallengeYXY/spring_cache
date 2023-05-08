package com.yangxinyu.app.controller;

import com.yangxinyu.app.entity.Student;
import com.yangxinyu.app.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : 星宇
 * @since : 2023/05/08
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;
    @GetMapping("getAll")
    public List<Student> getAll(){
        return studentService.getAll();
    }
}
