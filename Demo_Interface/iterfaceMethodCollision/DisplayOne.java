package iterfaceMethodCollision;

public interface DisplayOne {
	default void display(){
		System.out.println("display from 1");
	}
}
