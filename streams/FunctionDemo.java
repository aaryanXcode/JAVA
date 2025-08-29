
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//functional programming and lambda practices
public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = x-> 2*x;
        System.out.println(doubleIt.apply(2));

        List<Integer> list =  Arrays.asList(1,2,3,4,5);
        list.forEach((n)->{System.out.println(n);});

        


    }
}

