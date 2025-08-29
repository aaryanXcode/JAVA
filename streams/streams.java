import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 class StreamPipes{
	List<Integer> newList;
	public StreamPipes(List<Integer> data){
		this.newList = data;
	}
	public void show(){
		System.out.println(newList);	
	}

	public void show(List<Integer> newList){
		System.out.println(newList);	
	}
	public int power(int n, int x){
		int num = 1;
		while(x>0){
			num *=x;
			x--;
		}
		return num;
	}

	public List<Integer> powerOfElement(){
		return newList.stream().map(x->x*x).toList();
	}

	//return even numbers
//from collection jsut apply .stream() to convert into streams
	public void evenList(){
		System.out.println(newList.stream().filter(x->x%2==0).count());
	}

	
  
}

class Streams{
	public static void main(String args[]) {
		List<Integer> newList = Arrays.asList(1, 2, 3, 4, 5);
		StreamPipes newStream = new StreamPipes(newList);
		newStream.show();
		List<Integer> powList = newStream.powerOfElement();
		System.out.println("power List");
		newStream.show(powList);

		newStream.evenList();

		/*
		* from arrays 
		* 
		*/
		String[] array = {"a", "b", "c", "d"};
		//1 to convert array in stream
		Stream<String> stream1 = Arrays.stream(array);

		//using Stream.of()
		Stream<String> stream2 = Stream.of("a", "b");

		// 1 - infinite stream
		Stream<Integer> generate = Stream.generate(()->1).limit(100);

		//2 - infinite stream way 2
		List<Integer> generate2 = Stream.iterate(1, x->x+1).limit(100).collect(Collectors.toList());
		System.out.println(generate2);


		
	}
}


/*
 * what is stream ? - a sequence of elements(any collection element) supporting functional and declarative programming
 * how to use streams? - source, intermediate, operations, & terminal operations
 */