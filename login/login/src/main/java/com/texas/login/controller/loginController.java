package com.texas.login.controller;

import com.texas.login.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class loginController {


    private Student student;

    @PostMapping("/login")
    public boolean getStudent(@RequestBody Student student){

        if(student.getStd_id().equals("texas")&&student.getPassword().equals("texas")){
            return true;
        }else{
            return false;
        }
    }

    @GetMapping("/getall")
    public Student display(){
        if(student == null){
            student = new Student();
        }
        student.setStd_id("texas");
        student.setPassword("texas");
       return student;
    }


}
