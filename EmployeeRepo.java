package com.edubridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
