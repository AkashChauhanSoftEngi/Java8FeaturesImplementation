# Java8FeaturesImplementation

# Lambda Expression
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

# forEach
-List + Map+ with/without forEach
-java 8
```java
	/* forEach + lambda expression or method */
	items.forEach(item -> System.out.println(item));

	/* Output:-C */
	items.forEach(item -> {
		if ("C".equals(item)) {
			System.out.println();
			System.out.println(item);
		}
	});
```
```java
	/* forEach + lambda expression */
	items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

	/* Output:-C */
	items.forEach((k, v) -> {
		System.out.println("Item : " + k + " Count : " + v);
		if ("C".equals(k)) {
			System.out.println("C");
		}
	});
```
