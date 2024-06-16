package factory;

import design_dattern_factorymethod.Pizza;
import design_dattern_factorymethod.PizzaCheese;
import design_dattern_factorymethod.PizzaSeaFood;

public class FactoryCasa implements FactoryPizza{

	@Override
	public Pizza createPizza(String type) {
		Pizza p=null;
		if(type.equals("cheese")) {
			p=new PizzaCheese();
		}else if(type.equals("sea food")) {
			p=new PizzaSeaFood();
		}
		return p;
		
	}

}
