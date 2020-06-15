package com.demo.service.impl;

import com.demo.entity.CourseType;
import com.demo.entity.Student;
import com.demo.mapper.StudentMapper;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public void addStudent(Student student) {
        studentMapper.insert(student);

    }

    @Override
    public void removeStudent(Integer Id) {
        studentMapper.deleteByPrimaryKey(Id);
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.updateByPrimaryKey(student);

    }

    @Override
    public Student getStudentById(Integer Id) {
        return studentMapper.selectByPrimaryKey(Id);
    }

    @Override
    public List<Student> loadAll() {
        return studentMapper.selectAll();
    }
}
