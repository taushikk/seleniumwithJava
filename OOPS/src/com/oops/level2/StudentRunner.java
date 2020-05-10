package com.oops.level2;

public class StudentRunner {

	public static void main(String[] args) {
		/*
		 * Student student = new Student(); student.setName("Taushik");
		 * student.setEmail("taushik.khan@harman.com");
		 * student.setPhoneNumber("9958039156"); System.out.println(student);
		 */

		Employee employee = new Employee("Taushik", "Programmer");
		// employee.setName("Taushik");
		employee.setEmail("taushik.khan@harman.com");
		employee.setPhoneNumber("9958039156");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer");
		System.out.println(employee);
	}

}
