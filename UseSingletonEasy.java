package Preparation4;

public class UseSingletonEasy {
	public static void main(String[] args) {
		SingletonEasy a=SingletonEasy.getInstance();
		SingletonEasy b=SingletonEasy.getInstance();
		System.out.println(a.hashCode()+" Dhananjeyan");
		System.out.println(b.hashCode()+" valter");
	
	}


}
