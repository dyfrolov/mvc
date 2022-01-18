package telran.calculator.interfaces;

import java.util.Set;

public interface ICalculator {
	Set<String> getOperationCodes();
	int calculate(int op1, int op2, String operation);
}
