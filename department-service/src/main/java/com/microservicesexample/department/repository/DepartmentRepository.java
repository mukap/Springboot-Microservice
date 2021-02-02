package com.microservicesexample.department.repository;

import com.microservicesexample.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {   // Long is for ID
    Department findDepartmentById(Long departmentId);
}
