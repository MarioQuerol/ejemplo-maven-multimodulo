package basic.impl;

import basic.BasicOperation;

public class SumOperation implements BasicOperation<Integer> {
	@Override
	public String getOperationId() {
		return "sum";
	}

	@Override
	public Integer operation(Integer a, Integer b) {
		return a + b;
	}
}
