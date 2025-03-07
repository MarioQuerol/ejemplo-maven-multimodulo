package basic.impl;

import basic.BasicOperation;

public class StringContenationOperation implements BasicOperation<String> {
	@Override
	public String getOperationId() {
		return "stringContenation";
	}

	@Override
	public String operation(String a, String b) {
		return a + b;
	}
}
