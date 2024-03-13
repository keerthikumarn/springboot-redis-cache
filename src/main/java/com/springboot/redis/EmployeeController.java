package com.springboot.redis;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private EmployeeRepository empRepo;

	@Cacheable(value = "employees", key = "#empId", unless = "#result.age > 40")
	@GetMapping(value = "/{empId}")
	public Optional<Employee> getEmployee(@PathVariable Long empId) {
		LOG.info("Getting employee with ID {}.", empId);
		return empRepo.findById(empId);
	}

}
