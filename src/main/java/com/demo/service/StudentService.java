package com.demo.service;

import com.demo.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * 新增一条课程类型记录
     *
     * @param student
     *
     */
    void addStudent(Student student);

    /**
     * 删除一条课程类型记录
     *
     * @param Id
     *
     */
    void removeStudent(Integer Id);

    /**
     * 更新一条课程类型记录
     *
     * @param student
     *
     */
    void updateStudent(Student student);

    /**
     * 获取一条课程类型记录
     *
     * @param Id
     * @return CourseType
     *
     */
   Student getStudentById(Integer Id);

    /**
     *  获取所有课程类型记录
     *
     * @return List
     *
     */
    List<Student> loadAll();

}
