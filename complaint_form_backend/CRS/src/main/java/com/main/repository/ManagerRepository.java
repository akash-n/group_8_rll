package com.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.main.model.Complaints;
import com.main.model.Managers;

public interface ManagerRepository extends CrudRepository<Managers, String> {

	

}
