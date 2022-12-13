package com.student.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.student.core.Student;

import java.util.Collection;

public class StudentServiceTest {
	
	private ApplicationContext context;
	private StudentService service;

	@BeforeEach
	void setUp() {
		  context = new ClassPathXmlApplicationContext("beans.xml");
	}
 
	@Test
	void testGetOneStudent() {
		  service = context.getBean("studentService", StudentService.class);
		  assertNotNull(service);
	}
	
	@Test
	@Disabled
	void testGetAll() {
		 Collection<Student> students = service.getAllStudents();
		 assertNotNull(students);
		 System.out.println("Collected " + students.size() + " students.");
	}
}
