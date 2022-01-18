package telran.calculator.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;

import telran.calculator.interfaces.ICalculator;

public class CalculatorMap implements ICalculator{
	static Map<String, BinaryOperator<Integer>> mapOperations;
	static {
		mapOperations = new HashMap<>();
		mapOperations.put("+", (i,j)->i+j);
		mapOperations.put("-", (i,j)->i-j);
		mapOperations.put("*", (i,j)->i*j);
		mapOperations.put("/", (i,j)->i/j);
	}
	@Override
	public Set<String> getOperationCodes() {
		return mapOperations.keySet();
	}
	@Override
	public int calculate(int op1, int op2, String operation) {
		try {
			return mapOperations.get(operation).apply(op1, op2);
		} catch (NullPointerException e) {
			System.out.println(operation +  	" - unknown operation");
			return Integer.MIN_VALUE;
		} catch (Exception e) {
			return Integer.MIN_VALUE;
		}
	}
}
