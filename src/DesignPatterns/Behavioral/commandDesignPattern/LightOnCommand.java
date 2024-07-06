package DesignPatterns.Behavioral.commandDesignPattern;

public class LightOnCommand implements Command{
	
	// it will behave like cook and it can makeOrder().
	Light light;
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() { // makeOrder()
		light.on();
	}

}
