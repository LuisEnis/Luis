package advancedJava;


public class GenericClassComparable<T extends Comparable<T>> {
	
	private final T first;
	private final T second;
	
	public GenericClassComparable(T first, T second) {
		this.first=first;
		this.second=second;
	}
	
	public T getFirst() {
		return first;
	}
	
	public T getSecond() {
		return second;
	}
	
	@Override
	public String toString() {
		return first +" and "+ second;
	}
	
	public T getLargest() {
		if (first.compareTo(second)>0) {
			return first;
		}
		else {
			return second;
		}
	}
	

}
