package design_dattern_factorymethod;

public abstract class Pizza {
  String description;
  
  public String getDescription() {
	return description;
}
public abstract void bake();
  public abstract void wrapUp();
  public abstract void cook();
  public abstract void cut();
  
}
