package data;

public class Motorcycle extends Vehicle {
	
	
	
	public Motorcycle(String marca, String placa) {
		super(marca, placa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice(int minutes) {
		return minutes*60*50;		
	}
	
	

}
