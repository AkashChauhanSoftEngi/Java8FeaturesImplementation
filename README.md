# Java8FeaturesImplementation

## 1. Lambda Expression
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
  }});
```

## 2. forEach
- List + Map+ with/without forEach
- java 8
```java
	/* forEach + lambda expression or method */
	items.forEach(item -> System.out.println(item));
	
	/*One more way to use forEach to print list*/
	items.forEach(System.out::println);
		
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

## 3. Stream Filter
- java8
- String + Stream + Filter + Collectors
```java
	List<String> lines = Arrays.asList("spring", "node", "mkyong");
	lines.stream().filter(line -> !name.equals(line)).collect(Collectors.toList());
```

## 4. Stream Map
- java8
- String + Stream + Map + Collectors
```java
	List<String> lines = Arrays.asList("s", "n", "m");
	lines.stream().map(String::toUpperCase).collect(Collectors.toList());
```

## 5. Stream Collectors groupingBy
- java8
- String + Stream + Map + Collectors + Collectors.groupingBy()
```java
  Map<String, Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
```

## 6. 
