### ✅ **1. Core Functional Interfaces (java.util.function)**

These are introduced in **Java 8**:

| **Interface** | **Method** | **Description** |
|----|----|----|
| **Predicate<T>** | `boolean test(T t)` | Tests a condition |
| **Consumer<T>** | `void accept(T t)` | Consumes a value (no return) |
| **Supplier<T>** | `T get()` | Supplies a value (no input) |
| **Function<T,R>** | `R apply(T t)` | Converts T → R |
| **UnaryOperator<T>** | `T apply(T t)` | Unary operation (same type) |
| **BinaryOperator<T>** | `T apply(T t1, T t2)` | Binary operation (same type) |
| **BiPredicate<T,U>** | `boolean test(T t,U u)` | Predicate with 2 args |
| **BiConsumer<T,U>** | `void accept(T t,U u)` | Consumer with 2 args |
| **BiFunction<T,U,R>** | `R apply(T t,U u)` | Function with 2 inputs |



| **Interface** | **Method** | **Description** | **Example** |
|----|----|----|----|
| **Predicate** | `boolean test(T t)` | Checks a condition | `Predicate<Integer> isEven = x -> x % 2 == 0;` |
| **BiPredicate<T,U>** | `boolean test(T t, U u)` | Checks a condition with two inputs | `BiPredicate<String, String> startsWith = (s,p) -> s.startsWith(p);` |
| **Function<T,R>** | `R apply(T t)` | Converts T → R | `Function<String, Integer> length = s -> s.length();` |
| **BiFunction<T,U,R>** | `R apply(T t,U u)` | Two inputs, one output | `BiFunction<Integer,Integer,Integer> add = (a,b)->a+b;` |
| **Consumer** | `void accept(T t)` | Consumes a value | `Consumer<String> printer = s -> System.out.println(s);` |
| **BiConsumer<T,U>** | `void accept(T t,U u)` | Consumes two values | `BiConsumer<String,Integer> show = (s,i) -> System.out.println(s+"-"+i);` |
| **Supplier** | `T get()` | Supplies a value | `Supplier<Double> random = () -> Math.random();` |
| **UnaryOperator** | `T apply(T t)` | Operation on one value | `UnaryOperator<Integer> square = x -> x*x;` |
| **BinaryOperator** | `T apply(T t1,T t2)` | Operation on two same-type values | `BinaryOperator<Integer> sum = (a,b) -> a+b;` |


## Visual grouping 

Predicate → test()
Function → apply()
Consumer → accept()
Supplier → get()
Operator → apply()


### ✅ **5. Use with Streams**

* `filter(Predicate)`
* `map(Function)`
* `reduce(BinaryOperator)`
* `collect(Collectors...)`
* filter uses predicates 
* map uses function
* reduce uses BinaryOperator
* collect uses collectors


<https://chatgpt.com/c/68ab6daf-1844-8323-a6ac-0844aeebf12f>