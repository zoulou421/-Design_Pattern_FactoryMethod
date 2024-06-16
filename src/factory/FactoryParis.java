package factory;

import design_dattern_factorymethod.Pizza;
import design_dattern_factorymethod.PizzaCheese;
import design_dattern_factorymethod.PizzaSeaFood;

public class FactoryParis implements FactoryPizza{

	@Override
	public Pizza createPizza(String type) {
		Pizza p=null;
		if(type.equals("cheese")) {
			p=new PizzaCheese();
		}else if(type.equals("paris")) {
			p=new PizzaCheese();
		}
		return p;
		
	}

}
