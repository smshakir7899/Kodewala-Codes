package com.kodewala.stream.operations.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student
{

	String name;
	int marks;
	char grade;

	public Student(String name, char grade, int marks)
	{
		super();
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}
	
	@Override
	public String toString()
	{
		return "Student [name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}


	public static void main(String[] args)
	{

		Student s1 = new Student("Ayaan", 'A', 92);
		Student s2 = new Student("Fatima", 'B', 76);
		Student s3 = new Student("Rohan", 'C', 65);
		Student s4 = new Student("Lakshmi", 'A', 88);
		Student s5 = new Student("Imran", 'D', 54);
		Student s6 = new Student("Meera", 'B', 73);
		Student s7 = new Student("Zara", 'A', 95);
		Student s8 = new Student("Arjun", 'C', 61);
		Student s9 = new Student("Kabir", 'B', 79);
		Student s10 = new Student("Priya", 'A', 90);
		Student s11 = new Student("Salman", 'D', 49);
		Student s12 = new Student("Sita", 'C', 67);
		Student s13 = new Student("Yusuf", 'B', 74);
		Student s14 = new Student("Radha", 'A', 85);
		Student s15 = new Student("Nazia", 'C', 63);
		Student s16 = new Student("Farhan", 'B', 78);
		Student s17 = new Student("Ananya", 'A', 91);
		Student s18 = new Student("Shabana", 'C', 64);
		Student s19 = new Student("Vikram", 'D', 52);
		Student s20 = new Student("Ayesha", 'A', 89);

		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16,
				s17, s18, s19, s20);
		
		// Task 1:
		students.stream()
				.filter(st -> st.grade =='A')
				.sorted((a,b) -> b.marks-a.marks)
				.limit(3)
				.map(n -> n.name+"(TOPPER) " +" " +n.grade + " "+ n.marks )
				.forEach(list -> System.out.println(list));
		
		System.out.println();
		
		// Task 2:
		students.stream()
				.filter(student -> student.grade == 'A' || student.grade == 'B')
				.sorted((a,b) -> b.marks - a.marks)
				.skip(2)
				.limit(7)
				.map(student -> student.grade + " "+ student.name.toUpperCase())
				.forEach(name->System.out.println(name) );
		
		System.out.println();
		
		// Task 3:
		Map<Object, List<Student>> list = students.stream()
												  .sorted((a,b) -> b.marks-a.marks)
												  .collect(Collectors.groupingBy(list1 -> list1.grade));
												   System.out.println(list);
			System.out.println();									   
												   
	   // Task 4: 											   
		System.out.println("3rd Rank in Grade B: " + students.stream()
															 .filter(student -> student.grade == 'B')
															 .sorted((a,b) -> b.marks -a.marks)
															 .skip(2)
															 .findFirst()
															 .get());
		
		System.out.println();
		
		// Task 5: 
		List<Student> top3A = students.stream()
									  .filter(std -> std.grade == 'A')
									  .sorted((a,b) -> b.marks - a.marks)
									  .limit(3)
									  .collect(Collectors.toList());
		
		List<Student> bottom3B = students.stream()
										 .filter(std -> std.grade == 'B')
										 .sorted((a,b)-> a.marks - b.marks)
										 .limit(3)
										 .collect(Collectors.toList());
		
		HashMap<Character, List<Student>> map = new HashMap<>();
		map.put('A', top3A);
		map.put('B', bottom3B);
		
		System.out.println(map);
		
//		Map<Character, List<Student>> rslt =  students.stream()
//													  .filter(student -> student.grade == 'A' || student.grade == 'B')
//													  .collect(Collectors.groupingBy(s -> s.grade));
//		
//	 
//		
//		//System.out.println(rslt);
		System.out.println();
		
		// Task 6:
		List<Integer> numbers = Arrays.asList(12,-3,4,26,-6,7,8,19,-10,-24,32,22,6,7,11,44,38);
		
		Map<Boolean, List<Integer>> out = numbers.stream()
												 .filter(num -> num %2==0 && num>0)
												 .sorted((a,b) -> b-a) 
												 .collect(Collectors.partitioningBy(n -> n %4 ==0 ));
		
		System.out.println("Partioning using divisble by 4: " + out);
	}

	 

}
