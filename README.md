# Java8NewFeatures

* Java-8 Features (Since March 2014)
* Main Reasons to use Lambda Expressions
  - Concise code
  - To Enable Functional Programming
  - Lambda Expression {To bring benefits of FP into Java}
 * Though the Current version: Java-10

```text
################# Main Features #######################
 1. Lambda Expressions {->}
 2. Functional Interfaces 
 3. Default methods in Interface 
 4. Static Methods in Interfaces
 5. Predicate 
 6. Function 
 7. Consumer 
 8. Supplier 
 9. Method Reference & Constructor Reference by Double Colon(::) Operator.
 10. Stream API
 11. Date & Time API ( JODA API)
```

## 1. Lambda Expressions {->}
* It is an anonymous function
  - No Name
  - No Return-type
  - No Modifier
* Is not a generalize feature, it is specific to FI only. If no FI, then there is No LE.
* LE is applicable only on FI.
* No separate .class file will be generated for LE.
* Ex: n->n*n;
* FI: Functional Interface {Single abstract method only, in a Interface{SAM}->FI}
* To invoke Lambda Expressions, FI must be required
* FI should contain exactly one SAM but allowed to use any number of default & static methods
  - number of default methods and static methods can be 0 as well, restriction is SAM
  - Java8 provides one annotation name: @FunctionalInterface {Compiler inform, if out of rules}
* Return type rules
  - without curly braces return keyword can not be used
  - within curly braces if we want to return, we must use return statement
* Reference: https://www.youtube.com/watch?v=Tm2BpKlv1rU&list=PLd3UqWTnYXOlrKZWFTbgguqNRA_uVyeBl 


## 2. Functional Interfaces
* java.util.function; -> Several predefined FI's are there in this package.
* FI's in Java
  - interface Runnable-> run()
  - interface Comparator-> compare()
  - interface Comparable-> toCompare()
  - interface Predicate-> test()
  - interface Callable -> call()
* If anonymous inner class implements FI{SAM}, then only lambda expressions can be used but not for all AIC
* AIC: Anonymous Inner Classes
* At least and most one SAM in FI, and any number of default and static methods are allowed


## 3. Default methods in Interface {Virtual Extension/Defender Method}
* Until 1.7V every method present in interface must be public and abstract {Signs are Optional}
* Every variable present inside interface: public + static + final
* since 1.8v, inside interface default and static methods are allowed
* since 1.9v, even private methods are also allowed
* Since 1.8v, inside Interface, default method(Optional Method) is added as if abstract method addition will create problem in already existing implementation classes
* Without affecting the implementation classes if we want to add new methods to the interface ==> use Default methods
* It is not default modifier, as if no modifier then it is default access modifier
* Default methods only inside Interface, if overriding in implementation class then must use, public with them
* Object class methods are not allowed as default methods as they are already available, as it is already a child class of object class 
* In case of multiple interfaces implementation, For the same name default method, implementation class must override the method  


## 4. Static Methods in Interfaces
* Class is very costly than interface {constructor, blocks, setter and getter}
* If only static methods then why not use interface 
* General utility methods not required class, interface is enough[cost can be improved]
* Since 1.8v, interface can contain, static method also but not available directly unless interface name is not being used
* Interface static method by default not available to implementation class
* Even if the interface is not implemented, InterfaceName.staticMethod will be accessible
* Even to add main method inside Interface after 1.8v is allowed


## 5. Predefined Functional Interface {inside java.util.function; package}
* Predicate<T>	->boolean test(T t); {conditional/boolean checking}
* Function<T,R>	->R apply(T t); {} {Any return type, not restricted to only boolean type}
* Consumer<T>	->void accept(T t); {take some input, perform some operation and do not return anything}
* Supplier<T>	->T get(); {do not take any input, perform some operation and then return the result/object}
* ----------------------------------------------------------------------------------------------------------
* Predicate Join: default methods 
  - p.and(q).test(T)
  - p.or(q).test(T)
  - p.negate().test(T) 
* Function Chaining (any number of such operations are allowed)
  - f1.andThen(f2).apply(T): first f1 and then f2
  - f1.compose(f2).apply(T): first f2 and then f1



## 6. Two Arguments Predefined Functional Interface {inside java.util.function; package}
* ----------------------------------------------------------------------
* BiPredicate {normal can take one input, this one can take two inputs}
* BiFunction {normal can take one input, this one can take two inputs}
* BiConsumer {normal can take one input, this one can take two inputs}
* BiSupplier: no such function exist!
* For three arguments, no such Functional Interfaces are there
* ---------------------------------------------------------------------- 
* Predicate Join: default methods 
  - p.and(q).test(T)
  - p.or(q).test(T)
  - p.negate().test(T)
* Function Chaining (any number of such operations are allowed)
   - f1.andThen(f2).apply(T): first f1 and then f2
   - f1.compose(f2).apply(T): first f2 and then f1

## 7. Primitive Functional Interface {inside java.util.function; package}
* ---------------------------------------------------------
* IntPredicate {int input only, boolean output as usual}
* IntFunction {int input only and but can return anything}
* IntConsumer {int input only, no return as usual}
* IntSupplier {no input as usual, int output only}
* Since Java 1.5v Auto boxing/unboxing concept is there
  - int->Integer->int
* So if one uses these Primitive Functional Interfaces, Autoboxing and Autounboxing will not be used
* Predicates Types of Predicate
  - IntPredicate
  - DoublePredicate
  - LongPredicate
* Primitive version is not available for two arguments compulsory we have to choose Bi--- FI only.
* Primitive type of Functions
  - DoubleFunction
  - DoubleToIntFunction (Input as double, output/return type as int)
  - DoubleToLongFunction
  - IntToLongFunction
  - ToIntBiFunction {int as return, input can be anything}
  - ToIntFunction
  - ToDoubleBiFunction
  - ToLongBiFunction
  - ToLongFunction
* Primitive type of Consumer
  - IntConsumer {input always int}
  - LongConsumer
  - DoubleConsumer
  - ObjIntConsumer {one argument is always int, another can be anything}
  - ObjDoubleConsumer
* Primitive type of Supplier
  - BooleanSupplier
  - IntSupplier
  - LongSupplier
  - DoubleSupplier  

## UnaryOperator {one input}
 * UnaryOperator<T> {Child of a Function(I)}
 * IntUnaryOperator {input=output = int}
 * DoubleUnaryOperator {input=output = double}

 ## BinaryOperator {two input}
 * BinaryOperator {Child of BiFunction<T,T,T>, all three are same return type}
 * IntBinaryOperator {all three are int}
 * DoubleBinaryOperator
 * LongBinaryOperator

# Examples
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
  	Map<String, Long> result = items.stream().collect(Collectors.groupingBy(
	Function.identity(), Collectors.counting())
	);
```
