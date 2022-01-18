package telran.calculator.items;

import java.util.ArrayList;

import telran.calculator.interfaces.ICalculator;
import telran.view.InputOutput;

public class CalculationItem extends CalculatorItem {

	public CalculationItem(InputOutput inputOutput, ICalculator calculator) {
		super(inputOutput, calculator);
	}

	@Override
	public String displayedName() {
		return "Calculate";
	}

	@Override
	public void perform() {
		Integer op1 = inputOutput.inputInteger("Enter first operand");
		if(op1 == null)
			return;
		Integer op2 = inputOutput.inputInteger("Enter second operand");
		if(op2 == null)
			return;
		String operation = inputOutput.inputString("Enter operation code",
				new ArrayList<String>(calculator.getOperationCodes()));
		if(operation == null || operation.isEmpty())
			return;
		inputOutput.outputLine(calculator.calculate(op1, op2, operation));
	}
}
