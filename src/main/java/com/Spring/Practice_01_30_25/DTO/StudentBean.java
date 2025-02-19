package com.Spring.Practice_01_30_25.DTO;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Practice_01_30_25.Repository.RepositoryClass;
import com.Spring.Practice_01_30_25.model.StudentEntity;

@RestController
public class StudentBean {

	private RepositoryClass repObj;
	
	public StudentBean(RepositoryClass obj) {
		  this.repObj = obj;
	}
	
	@RequestMapping(value = "/create")
	public StudentEntity createField() {
		StudentEntity seObj = new StudentEntity();
		seObj.setName("Krishna");
		seObj.setContact("9014921762");
		 return repObj.save(seObj);
	}
	
	@GetMapping("/retrieve")
	public List<StudentEntity> retrieve() {
		List<StudentEntity> sobj = repObj.findAll();
		return sobj;
	}
	
}
