package com.example.UniversityEventManagement.controller;

import com.example.UniversityEventManagement.model.Student;
import com.example.UniversityEventManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/uem")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("get-all")
    public List<Student> getall(){
        return studentService.getall();
    }

    @GetMapping("get-by-id/id/{id}")
    public Student findbyid(@PathVariable int id){
        return studentService.findbyid(id);
    }

    @PostMapping("/add-student")
    public void addstudent(@RequestBody Student student){
         studentService.addStudent(student);
    }

    @DeleteMapping("/delete-student/id/{id}")
    public void deletestudent(@PathVariable int id){
          studentService.deleteStudent(id);
    }

    @PutMapping("update-student/id/{id}")
    public void updateStudent(@PathVariable int id,@RequestBody Student student){
         studentService.updateStudent(id,student);
    }
}
