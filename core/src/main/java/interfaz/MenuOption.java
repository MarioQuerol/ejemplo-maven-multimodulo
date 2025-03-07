package interfaz;

public enum MenuOption {
	SPLIT(1),
	SUM(2),
	CONCATENATE(3),
	EXIT(4);

	private int value;

	private MenuOption(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static MenuOption fromValue(int value) {
		for (MenuOption option : MenuOption.values()) {
			if (option.getValue() == value) {
				return option;
			}
		}
		return null;
	}
}
