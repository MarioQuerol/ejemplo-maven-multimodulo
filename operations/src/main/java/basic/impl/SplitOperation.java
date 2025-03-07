package basic.impl;

import basic.BasicOperation;

public class SplitOperation implements BasicOperation<Double>{
	@Override
	public String getOperationId() {
		return "split";
	}

	@Override
	public Double operation(Double a, Double b) {
		return a / b;
	}
}
