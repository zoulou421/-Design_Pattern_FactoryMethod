package design_dattern_factorymethod;

public class PizzaCheese extends Pizza {

	public PizzaCheese() {
		this.description="Pizza Cheese";
	}

	@Override
	public void bake() {
		System.out.println("Bake in 4 min...");
		
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
