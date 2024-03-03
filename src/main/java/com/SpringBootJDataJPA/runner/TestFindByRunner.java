package com.SpringBootJDataJPA.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootJDataJPA.repo.StudentRepository;
@Component
public class TestFindByRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository srepo;
	@Override
	public void run(String... args) throws Exception {
		//srepo.findBystdCourse("Core Java").forEach(System.out::println);
		//srepo.findBystdFee(300.00).forEach(System.out::println);
		//srepo.findByStdId(20).forEach(System.out::println);
		srepo.findByStdIdGreaterThanEqual(10).forEach(System.out::println);
	}

}
