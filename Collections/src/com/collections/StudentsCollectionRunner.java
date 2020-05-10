package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Khan"), new Student(22, "Malik"), new Student(13, "Taushik"));
		System.out.println(students);

		ArrayList<Student> studentsAl = new ArrayList<>(students);
		System.out.println(studentsAl);

		Collections.sort(studentsAl);
		System.out.println("ASC " + studentsAl);

		// Collections.sort(studentsAl, new AcendingStudentComparator());
		studentsAl.sort(new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator " + studentsAl);
	}

}
