package iterfaceMethodCollision;

class demo_interface_method_collision implements DisplayOne,DisplayTwo{

	@Override
	public void display() {
		// Implementation of display() method
		DisplayOne.super.display();
		DisplayTwo.super.display();
	}

    public static void main(String[] args) {
        demo_interface_method_collision obj = new demo_interface_method_collision();
        obj.display();
    }

}
