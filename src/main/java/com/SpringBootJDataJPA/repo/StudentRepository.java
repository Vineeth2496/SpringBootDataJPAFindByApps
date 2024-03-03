package com.SpringBootJDataJPA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootJDataJPA.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	//SQL: select * from stdtab where scourse=:course
	//findBy<VariableName>(DataType paramName)
	//List<Student> findBystdCourse(String scourse);
	
	//SQL: select * from stdtab where sfee=:fee
	//List<Student> findBystdFee(Double sfee);
	
	//SQL: select * from stdtab where stdId>=?
	//findBy<VariableNameKeyword>(DataType paramName)
	//List<Student> findByStdId(Integer sid);
	List<Student> findByStdIdGreaterThanEqual(Integer sid);
	
}
