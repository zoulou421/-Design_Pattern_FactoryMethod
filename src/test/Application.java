package test;

import design_dattern_factorymethod.Pizza;
import factory.FactoryCasa;
import factory.FactoryPizza;
import pizzeria.Pizzeria;

public class Application {
 public static void main(String[] args) {
	 Pizzeria pizzeria=new Pizzeria(new FactoryCasa());
	 Pizza p1=pizzeria.order("cheese");
	 System.out.println(p1.getDescription());
 }
}
