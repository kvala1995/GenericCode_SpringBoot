package com.Spring.Practice_01_30_25.Repository;

import java.text.Normalizer.Form;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.Spring.Practice_01_30_25.model.StudentEntity;

@Repository
public interface RepositoryClass extends JpaRepository<StudentEntity,Integer> {

	@Query("select s from StudentEntity s where s.name like %:domain%")
	List<StudentEntity> findByDomain(@Param("domain") String domain);
	
}
