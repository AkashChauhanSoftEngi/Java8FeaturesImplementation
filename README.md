# Java8FeaturesImplementation

# Lambda
- Sorting + Comparator + with/without Lambda Expression
- Java8
```java
  List<Student> students = new ArrayList<Student>();
  students.sort((Student s1, Student s2)->s1.getAge()-s2.getAge());
  
  /*Instead*/
  Collections.sort(students, new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					return o1.getAge() - o2.getAge();
				}

	});
```


