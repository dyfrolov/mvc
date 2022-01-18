package telran.calculator.items;

import telran.calculator.interfaces.ICalculator;
import telran.view.InputOutput;
import telran.view.Item;

public abstract class CalculatorItem implements Item {
	protected InputOutput inputOutput;
	protected ICalculator calculator;
	public CalculatorItem(InputOutput inputOutput, ICalculator calculator) {
		super();
		this.inputOutput = inputOutput;
		this.calculator = calculator;
	}
}
