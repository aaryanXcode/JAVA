package iterfaceMethodCollision;

public interface DisplayTwo {
    default void display(){
        System.out.println("display form 2");
    }
}
