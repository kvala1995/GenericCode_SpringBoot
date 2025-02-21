package com.Spring.Practice_01_30_25.DTO;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping(" ")
	public List<StudentEntity> retrieve() {
		List<StudentEntity> sobj = repObj.findAll();
		return sobj;
	}
	
	@PostMapping("/table/create")
	public StudentEntity createTable(@RequestBody StudentEntity entity) {
		return repObj.save(entity);
	}
	
	@PatchMapping("/table/patch")
	public StudentEntity patchcontact(@RequestParam("id") Integer id, @RequestParam("contact") String contact) {
		  Optional<StudentEntity> sEntity = repObj.findById(id);
		  if(sEntity.isPresent()) {
			  StudentEntity sobj = sEntity.get();
			  sobj.setContact(contact);
			  return repObj.save(sobj);
		  }
		  return null;
	}
	
	@GetMapping("table/name")
	public List<StudentEntity> getDomain(@RequestParam("domain") String domain){
		return  repObj.findByDomain(domain);
		
	}
		
	
}
