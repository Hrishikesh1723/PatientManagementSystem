package com.example.PatientManagementSystem.dao;

import com.example.PatientManagementSystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDAO extends JpaRepository<Department, Long>{
}
