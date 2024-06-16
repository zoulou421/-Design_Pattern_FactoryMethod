package pizzeria;

import design_dattern_factorymethod.Pizza;
import factory.FactoryPizza;

public class Pizzeria {
	private FactoryPizza factory;

	public Pizzeria(FactoryPizza factory) {
		this.factory = factory;
	}
	
	public Pizza order(String type) {
		Pizza p= factory.createPizza(type);
		p.cook();
		p.bake();
		p.cut();
		p.wrapUp();
		return p;
	}
    
}
