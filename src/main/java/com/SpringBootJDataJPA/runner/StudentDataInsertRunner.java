package com.SpringBootJDataJPA.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootJDataJPA.model.Student;
import com.SpringBootJDataJPA.repo.StudentRepository;
//@Component
public class StudentDataInsertRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository srepo;
	@Override
	public void run(String... args) throws Exception {
		srepo.saveAll(Arrays.asList(
					new Student(10, "SHYAM", 300.00, "Core Java"),
					new Student(11, "RAM", 300.00, "Core Java"),
					new Student(12, "SYED", 450.00, "Advanced Java"),
					new Student(13, "AJAY", 450.00, "Advanced Java"),
					new Student(14, "JAI", 500.00, "Micro Service"),
					new Student(15, "KUMAR", 600.00, "Boot"),
					new Student(16, "SANJU", 500.00, "Spring")
					));
		srepo.findAll().forEach(System.out::println);
	}

}
