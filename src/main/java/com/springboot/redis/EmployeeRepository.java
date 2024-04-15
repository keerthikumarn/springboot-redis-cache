package com.springboot.redis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JPA repo interface for Employee table
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
