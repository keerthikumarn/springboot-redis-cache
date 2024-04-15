package com.springboot.redis;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

/**
 * Table data of Employee entity
 */
@Entity
public class Employee implements Serializable {

	private static final long serialVersionUID = 7584074859088641968L;

	@Id
	@SequenceGenerator(name = "SEQ_GEN", sequenceName = "EMP_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
	private Long id;
	private String name;
	private String divsion;
	private String email;
	private int age;

	public Employee() {

	}

	public Employee(String name, String divsion, String email, int age) {
		super();
		this.name = name;
		this.divsion = divsion;
		this.email = email;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDivsion() {
		return divsion;
	}

	public void setDivsion(String divsion) {
		this.divsion = divsion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", divsion=" + divsion + ", email=" + email + ", age=" + age
				+ "]";
	}

}
