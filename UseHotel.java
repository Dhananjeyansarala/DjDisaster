package Preparation4;

public class UseHotel {
	public void NonVegFood() {
		System.out.println("Biriyani");
	}
	public static void main(String[] args) {
		UseHotel hotel=new UseHotel();
		Hotel host=hotel::NonVegFood;
		host.vegfood();
	}

}
