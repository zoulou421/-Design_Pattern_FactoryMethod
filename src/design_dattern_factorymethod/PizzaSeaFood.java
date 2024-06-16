package design_dattern_factorymethod;

public class PizzaSeaFood extends Pizza {

	public PizzaSeaFood() {
		this.description="Pizza SeaFood";
	}

	@Override
	public void bake() {
		System.out.println("Bake in 6 min...");
		
	}

	@Override
	public void wrapUp() {
		System.out.println("Simple wrapping.");
		
	}

	@Override
	public void cook() {
		System.out.println("Cook in 7 min...");
		
	}

	@Override
	public void cut() {
		System.out.println("Cut in 6 parts!");
		
	}

}
