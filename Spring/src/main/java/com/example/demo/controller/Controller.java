package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.StuEntity;
import com.example.demo.Service.stuService;

@RestController
@RequestMapping("/student")
public class Controller {
	@Autowired
	stuService sts;
	
	@PostMapping("/post")
	public void save() {
		sts.savestudent();
	}
	
	@GetMapping("/get")
	public List<StuEntity> getStudent(){
		return sts.getStudent();
	} 
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable Integer id) {
		sts.deleteStudent(id);
	}

}
