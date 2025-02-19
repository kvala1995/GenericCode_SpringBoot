package com.Spring.Practice_01_30_25.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.Practice_01_30_25.model.StudentEntity;

@Repository
public interface RepositoryClass extends JpaRepository<StudentEntity,Integer> {

}
