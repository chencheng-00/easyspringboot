package com.demo.controller;

import com.demo.entity.CourseType;
import com.demo.entity.Student;
import com.demo.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 访问课程类型输入界面
     */
    @GetMapping("/toInput")
    public String input(Map<String, Object> map) {
        map.put("student", new Student());

        return "student/input_student";
    }

    /**
     * 创建新课程类型
     */
    @PostMapping(value="/create")
    public String create(Student student) {

        studentService.addStudent(student);

        return "redirect:/student/list";

    }

    @GetMapping("/list")
    public String list(Map<String, Object> map, @RequestParam(value="pageNo", required=false, defaultValue="1") String pageNoStr) {

        int pageNo = 1;

        //对 pageNo 的校验
        pageNo = Integer.parseInt(pageNoStr);
        if(pageNo < 1){
            pageNo = 1;
        }

        /*
         * 第一个参数：第几页;
         * 第二个参数：每页获取的条数.
         */
        PageHelper.startPage(pageNo, 3);
        List<Student> studentList = studentService.loadAll();

        PageInfo<Student> page=new PageInfo<Student>(studentList);

        map.put("page", page);

        return "student/list_student";
    }

    @DeleteMapping(value="/remove/{sid}")
    public String remove(@PathVariable("sid") Integer typeId) {

        studentService.removeStudent(typeId);

        return "redirect:/student/list";
    }

    @GetMapping(value="/preUpdate/{sid}")
    public String preUpdate(@PathVariable("sid") Integer sid, Map<String, Object> map) {
//        System.out.println(studentService.getCourseTypeById(sid));
        map.put("student", studentService.getStudentById(sid));

        return "student/update_student";
    }

    @PutMapping(value="/update")
    public String update(Student student) {
        System.out.println("id信息----->"+student.getSid());
        System.out.println("新增学生的信息："+student);
        studentService.addStudent(student);

        return "redirect:/student/list";
    }
}
