package design_dattern_factorymethod;

public class PizzaParis extends Pizza {

	public PizzaParis() {
		this.description="Pizza Paris";
	}

	@Override
	public void bake() {
		System.out.println("Bake in 3 min...");
		
	}

	@Override
	public void wrapUp() {
		System.out.println("Simple wrapping.");
		
	}

	@Override
	public void cook() {
		System.out.println("Cook in 5 min...");
		
	}

	@Override
	public void cut() {
		System.out.println("Cut in 4 parts!");
		
	}

}
