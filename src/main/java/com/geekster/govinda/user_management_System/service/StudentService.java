package com.geekster.govinda.user_management_System.service;

import com.geekster.govinda.user_management_System.entity.Student;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class StudentService {

    private static List<Student>list= new ArrayList<>();

    static {
        list.add(new Student(1,"Govinda Kumar Mishra","gm235612","paharpur Ara (bihar) 802201","6204840729"));
        list.add(new Student(2,"Sankalp","sankalp366","paharpur Ara (bihar) 802201","6207942061"));
        list.add(new Student(3,"Shashi singh","shashi01mohan","paharpur Ara (bihar) 802301","8709973898"));
    }

    public List<Student> getAllStudent(){

        return list;
    }

    // Get single student by id

    public Student getStudentById(int userId){
        Student student=null;

        student=list.stream().filter(e ->e.getUserId()==userId).findFirst().get();

        return student;
    }
    // for adding student

    public Student  addStudent(Student s){
        list.add(s);
        return s;
    }
    // delete method student

    public void  deleteStudent(int userId){
        list=list.stream().filter(e -> e.getUserId()!= userId ).collect(Collectors.toList());
    }

    // update student
    public void  updateStudent(Student student , int userId){
        list=list.stream().map(s ->{
            if(s.getUserId() == userId) {
                s.setName(student .getName());
                s.setUserName(student.getUserName());
                s.setAddress(student.getAddress());
                s.setPhone(student.getPhone());

            }
            return s;

        }).collect(Collectors.toList());



    }





}
