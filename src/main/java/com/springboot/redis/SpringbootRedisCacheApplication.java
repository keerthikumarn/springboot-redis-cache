package com.springboot.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootRedisCacheApplication implements CommandLineRunner {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private EmployeeRepository empRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRedisCacheApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Saving employee details. current employee count is {}.", empRepo.count());
		Employee keerthi = new Employee("Keerthi Kumar N", "EPD", "keerthi@no-reply.com", 38);
		Employee gautam = new Employee("Raghavendra Nayak", "SSP", "raghav@no-reply.com", 41);
		Employee raghav = new Employee("Gautam A P", "CT", "gautam@no-reply.com", 37);
		Employee vineeth = new Employee("Vineeth Bilgi", "HSP", "vineeth@no-reply.com", 39);

		empRepo.save(keerthi);
		empRepo.save(gautam);
		empRepo.save(raghav);
		empRepo.save(vineeth);
		LOG.info("Done saving employees. Data: {}.", empRepo.findAll());
	}

}
