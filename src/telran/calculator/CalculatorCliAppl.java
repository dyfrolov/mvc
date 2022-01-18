package telran.calculator;


import telran.calculator.interfaces.ICalculator;
import telran.calculator.items.CalculationItem;
import telran.calculator.items.DisplayOperationCodesItem;
import telran.calculator.service.CalculatorMap;
import telran.view.ConsoleInputOutput;
import telran.view.ExitItem;
import telran.view.InputOutput;
import telran.view.Item;
import telran.view.Menu;

public class CalculatorCliAppl {
	static InputOutput inputOutput = new ConsoleInputOutput();
	static ICalculator calculator = new CalculatorMap();
	public static void main(String[] args) {
		Item[] items = {
				new DisplayOperationCodesItem(inputOutput, calculator),
				new CalculationItem(inputOutput, calculator),
				new ExitItem()
		} ;
		Menu menu = new Menu(items, inputOutput);
		menu.runMenu();
	}

}
