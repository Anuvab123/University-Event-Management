package com.example.UniversityEventManagement.service;

import com.example.UniversityEventManagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {

    private static List<Student> students=new ArrayList<>();
    private static int stcount=0;
    static{
        students.add(new Student(++stcount,"Anuvab","Ghosh",22,"Electrical"));
        students.add(new Student(++stcount,"Utsav","Ghosh",30,"Chemistry"));
        students.add(new Student(++stcount,"Uddipan","Ghosh",19,"Computer"));
        students.add(new Student(++stcount,"projjal","Patra",22,"Computer"));
    }

    public List<Student> getall(){
        return students;
    }

    public Student findbyid(int id){
        for(Student student:students){
            if(student.getStudentId()==id){
                return student;
            }
        }
        return null;
    }

    public void addStudent(Student student){

        students.add(student);
    }

    public void deleteStudent(int id){
        Student s=findbyid(id);
        students.remove(s);
    }

    public void updateStudent(int id,Student newstudent){
        Student student=findbyid(id);

        student.setStudentId(newstudent.getStudentId());
        student.setAge(newstudent.getAge());
        student.setFirstname(newstudent.getFirstname());
        student.setLastname(newstudent.getLastname());
        student.setDept(newstudent.getDept());
    }
}
