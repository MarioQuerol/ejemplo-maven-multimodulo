package interfaz;

import java.util.Scanner;

public class Console {
	private Scanner scanner;

	public Console(Scanner scanner) {
		this.scanner = scanner;
	}

	public void print(String message) {
		System.out.println(message);
	}

	public void printError(String message) {
		System.err.println(message);
	}

	public MenuOption menu() {
		System.out.println("Select an operation:");
		System.out.println("1. Split");
		System.out.println("2. Sum");
		System.out.println("3. String concatenation");
		System.out.println("4. Exit");
		System.out.print("Option: ");

		return MenuOption.fromValue(Integer.parseInt(readLine()));
	}

	public String readLine() {
		return scanner.nextLine();
	}

	public void closeScanner() {
		scanner.close();
	}
}
