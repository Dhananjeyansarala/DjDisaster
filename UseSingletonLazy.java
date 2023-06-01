package Preparation4;

public class UseSingletonLazy {
	public static void main(String[] args) {
		SingletonLazy single1=SingletonLazy.getInstance();
		SingletonLazy single2=SingletonLazy.getInstance();
		
		System.out.println(single1.hashCode()+" don");
		System.out.println(single2.hashCode()+" don");
	}

}
