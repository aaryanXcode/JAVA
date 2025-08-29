package lambdaExpression;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.DoubleBinaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;

/*
 * lambda expression just an anonnymous function with ->
 * no name
 * no return type
 * no access modifier(public private , protected)
 * syntaxes may vary 
 * anonymous function basic syntax `(pass arguments1, pass arguments2)->{ set of code };`
 * for a single arguments just type : `argument-> expression`
 */

class lambdaExpressionPractice{
    List<String> name;
    List<Integer> number;
    List<Person> people;
    public lambdaExpressionPractice(List<String> name, List<Integer> n, List<Person> people){
        this.name = name;
        this.number = n;
        this.people = people;
    }
    void printName(){
        System.out.println("\nprinting names:\n");
        name.forEach((n)->{System.out.println(n);});
    }

    void sortNames(){
        System.out.println("\nSorting names:\n");
        Collections.sort(name);
        name.forEach(
            (n)->{
                System.out.println(n);
            });
    }

    void sortInDesc(){
        System.out.println("\nSorting:\n");
        Collections.sort(number, Collections.reverseOrder());
       
        number.forEach(
            (n)->{
                System.out.println(n);
            });
    }

    void convertinUpperCase(){
        System.out.println("\nupper case\n");
        name.forEach(
            (n)->{
                System.out.println(n.toUpperCase());
            });
    }

    void filterEvenNum(){
        System.out.println("\neven num\n");
        number.forEach(
            (n)->{
                if(n%2==0){
                    System.out.println(n);
                }
            });
    }

    void findLenth(){
        System.out.println("\nlength of string:\n");
        name.forEach((names)->{
            System.out.println(names.length());
        });
    }

    void sumOfAll(){
        System.out.println("\nSum of All:\n");
        int sum = number.stream().reduce(0, (a, b)-> a+b );
        System.out.println(sum);
    }

    void longestString(){
        System.out.println("\nlongest string:\n");
        String maxLengthWord = Collections.max(name, (a, b) -> a.length() - b.length());
        System.out.println("Longest word: " + maxLengthWord);
    }

    void sortObjListByField(){
        System.out.println("\nsort people by age :\n");

        Collections.sort(people, (p1,p2)->{ 
            return Integer.compare(p1.age, p2.age);
        } );

        people.forEach((n)->{
            System.out.println(n.name + " " + n.age);
        });

    }

    void checIsPrime(int n){

        Predicate<Integer> isPrime = nx->{
            if(nx<=1)
                return false;
            for(int i = 2; i*i<=nx; i++){
                if(nx%i==0){
                    return false;
                }
            }
            return true;

        };
        
        boolean isPrimeResult = isPrime.test(n);
       
        System.out.println(n + " is prime? " + isPrimeResult);
    }

    void concatTwoString(String s1, String s2){
        BiFunction<String, String,String> concat = (str1,str2) -> {
            return str1+str2;
        };

        String concatedString = concat.apply(s1, s2);
        System.out.println(concatedString);
    }

    void findAvgOfDouble(double d1, double d2){
        DoubleBinaryOperator dubleOperation = (var1, var2)->{
            return (var1+var2)/2;
        };

        double avg = dubleOperation.applyAsDouble(d1, d2);
        System.out.println(avg);
    }

    void getFactorial(){
        LongUnaryOperator longval = ni -> {
            long result = 1;
            for(int i = 1; i<=ni; i++){
                result *= i;
            }
            return result;
        };
        long n = 5;
        long fact = longval.applyAsLong(n);
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    void isPalindrome(String s){
        Predicate<String> ps = str->{
            String newStr = new StringBuilder(str).reverse().toString();
            return str.equals(newStr);
        };

        boolean ispalin = ps.test(s);
        System.out.println(s + " is a palindrome? " + ispalin);
    }

    void isPerfectSquare(int num){
        Predicate<Integer> ps = n->{
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n; 
        };

        boolean ispersqr = ps.test(num);
        System.out.println(num + " is a perfect square? " + ispersqr);
    }


}

class Person {
    String name;
    int age;
    Person(String name, int age) 
    { 
        this.name = name; this.age = age; 
    }
}


public class lambdaExpressionDemo {
    public static void main(String args[]){
        List<String> names = Arrays.asList("Aryan", "Alice", "Bob", "Charlie");
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 2, 3, 4, 5, 6);
        List<Person> people = Arrays.asList(
            new Person("Alice", 25),
            new Person("Bob", 30),
            new Person("Charlie", 20)
        );
        lambdaExpressionPractice obj = new lambdaExpressionPractice(names, numbers, people);

        //printing
        obj.printName();

        //sort name using collection
        obj.sortNames();

        //sort list in descending order
        obj.sortInDesc();

        //convert in uppercase
        obj.convertinUpperCase();

        //filter even
        obj.filterEvenNum();

        //find length
        obj.findLenth();

        //sum of all
        obj.sumOfAll();

        //longest stirng in list
        obj.longestString();

        //sort people list by age
        obj.sortObjListByField();

        obj.checIsPrime(17);

        obj.concatTwoString("Aryan", "java");

        //avg of 2 double number
        obj.findAvgOfDouble(10.5 , 9.5);

        //factorial using lambda
        obj.getFactorial();

        obj.isPalindrome("xoxox");

        obj.isPerfectSquare(26);
        

        
    }
}

