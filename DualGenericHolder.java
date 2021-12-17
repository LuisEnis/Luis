package advancedJava;

public class DualGenericHolder <T, U> {
	T obj1;
	U obj2;
	
	DualGenericHolder(T obj1, U obj2) {
		this.obj1=obj1;
		this.obj2=obj2;
	}
	
	public void display() {
		System.out.println("My closest friends call me "+ obj2+" instead of my real name which is Enis and I am "+obj1+" years old.");
	}
	
	public static void main(String[] args) {
		DualGenericHolder<Integer, String> obj = new DualGenericHolder<Integer, String> (21, "Luis");
		obj.display();
	}

}
