package com.youzhong.service.impl;

import com.youzhong.dao.StudentMapper;
import com.youzhong.entity.Student;
import com.youzhong.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService  implements IStudentService{

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> list() {
        return studentMapper.selectByExample(null);
    }
}
