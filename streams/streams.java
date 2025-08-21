import java.util.*;
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
  
}

class Streams{
	public static void main(String args[]) {
	List<Integer> newList = Arrays.asList(1, 2, 3, 4, 5);
	StreamPipes newStream = new StreamPipes(newList);
	newStream.show();
	List<Integer> powList = newStream.powerOfElement();
	System.out.println("power List");
	newStream.show(powList);
	
	}
}
