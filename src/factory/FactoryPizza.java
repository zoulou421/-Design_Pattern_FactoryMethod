package factory;

import design_dattern_factorymethod.Pizza;

//This is an alternative class for Interface.
//You can also create an abstract class
//Just to let you know that this is an alternative.

public interface FactoryPizza {
 public Pizza createPizza(String type);
}
