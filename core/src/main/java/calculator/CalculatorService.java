package calculator;

import basic.BasicOperation;
import basic.impl.SplitOperation;
import basic.impl.StringContenationOperation;
import basic.impl.SumOperation;
import interfaz.Console;
import interfaz.MenuOption;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculatorService {
	private final Console console;

	Map<String, BasicOperation> operations;

	public CalculatorService() {
		Scanner scanner = new Scanner(System.in);
		console = new Console(scanner);
		operations = generateOperations();
	}

	private Map<String, BasicOperation> generateOperations() {
		Map<String, BasicOperation> operations = new HashMap<>();

		operations.put("sum", new SumOperation());
		operations.put("split", new SplitOperation());
		operations.put("concat", new StringContenationOperation());

		return operations;
	}

	public void runCalculator() {
		console.print("Calculator is running");

		MenuOption option;
		do {
			option = console.menu();
			switch (option) {
				case MenuOption.SPLIT:
					operar("split");
					break;
				case MenuOption.SUM:
					operar("sum");
					break;
				case MenuOption.CONCATENATE:
					operarString("concat");
					break;
				default:
					console.printError("Invalid option");
			}
		} while (!MenuOption.EXIT.equals(option));

		console.closeScanner();
		console.print("Thank you for using the calculator uwu");
	}

	private void operar(String operation) {
		try {
			console.print("Enter the first number:");
			int a = Integer.parseInt(console.readLine());
			console.print("Enter the second number:");
			int b = Integer.parseInt(console.readLine());
			console.print("The result is: " + operations.get(operation).operation(a, b));
		} catch (NumberFormatException e) {
			console.printError("Numero introducido invalido");
		} catch (Exception e) {
			console.printError("Error desconocido. Intente de nuevo");
		}
	}

	private void operarString(String operation) {
		try {
			console.print("Enter the first string:");
			String a = console.readLine();
			console.print("Enter the second string:");
			String b = console.readLine();
			console.print("The result is: " + operations.get(operation).operation(a, b));
		} catch (Exception e) {
			console.printError("Error desconocido. Intente de nuevo");
		}
	}
}
