package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.StuEntity;
import com.example.demo.Repositry.stuRepositry;

@Service
public class stuService {
	@Autowired
	private stuRepositry sturepo;
	
	public void savestudent(){
		StuEntity a=new StuEntity();
		a.setName("Hero");
		a.setAddress("London");
		sturepo.save(a);
		
	}
	public List<StuEntity> getStudent()
	{
		return sturepo.findAll();
	}
	public void deleteStudent(Integer id)
	{
		sturepo.deleteById(id);
	}
	
	
	

}
