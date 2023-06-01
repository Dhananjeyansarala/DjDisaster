package Preparation4;

public class UseElectricity implements Electricity{
	public void print() {
		System.out.println("Not Safe");
	}
	public static void main(String[] args) {
		UseElectricity elec=new UseElectricity();
		Electricity.onOff(true);
		elec.shock();
		elec.print();
	}

}
