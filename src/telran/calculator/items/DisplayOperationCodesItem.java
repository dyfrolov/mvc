package telran.calculator.items;

import telran.calculator.interfaces.ICalculator;
import telran.view.InputOutput;

public class DisplayOperationCodesItem extends CalculatorItem {

	public DisplayOperationCodesItem(InputOutput inputOutput, ICalculator calculator) {
		super(inputOutput, calculator);
	}

	@Override
	public String displayedName() {
		return "Display Operation Codes";
	}

	@Override
	public void perform() {
		calculator.getOperationCodes().forEach( c-> inputOutput.output(c+" ") );
		inputOutput.outputLine("");
	}
}
