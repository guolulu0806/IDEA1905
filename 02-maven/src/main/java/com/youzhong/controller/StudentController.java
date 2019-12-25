package com.youzhong.controller;


import com.youzhong.entity.Student;
import com.youzhong.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @RestController 相当于 @Controller 和 @ResponseBody
 */
@RestController
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/list")
    public List<Student> list() {

        return studentService.list();
    }

}
