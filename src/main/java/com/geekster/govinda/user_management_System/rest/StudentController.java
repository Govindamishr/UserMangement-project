package com.geekster.govinda.user_management_System.rest;

import com.geekster.govinda.user_management_System.entity.Student;
import com.geekster.govinda.user_management_System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class StudentController {

    // define endPoint for student and return list of student

    @Autowired
     StudentService theStudent;

    // for fetch all the data
    @GetMapping("/students")

    public List<Student> getStudent(){

        return theStudent.getAllStudent();
    }
    // for fetch data through id
    @GetMapping("/students/{userId}")

    public Student getStudentThroughId(@PathVariable("userId") int userId){

        return theStudent.getStudentById(userId);
    }

    // post mapping

    @PostMapping("/students")

    public String  getAddStudent(@RequestBody Student student){

        theStudent.addStudent(student);
        return "SuccessFully Add new Student";
    }

    // delete mapping

    @DeleteMapping("/students/{userId}")

    public String deleteStudentById(@PathVariable int userId){
        theStudent.deleteStudent(userId);
        return "Student Are delete Successfully";

    }

    //update mapping

    @PutMapping("/students/{userId}")

    public Student updateStudent(@RequestBody Student student ,@PathVariable ("userId") int userId){
        this.theStudent.updateStudent(student ,userId);
        return student;
    }



}
