package Preparation4;

public interface Electricity {
	public static void onOff(boolean onOff) {
		if(onOff==true) {
			System.out.println("The machine is woring");
		}
		else {
			System.out.println("The machine is Not working");
		}
	}
	public default void shock() {
		System.out.println("It is shocking");
	}
	public void print();

}
