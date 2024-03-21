package controller;

import br.edu.fateczl.stack.IntStack;

public class ConvertController {

	private IntStack stack;

	public ConvertController() {
		this.stack = new IntStack();
	}

	public String decToBin(int decimal) throws Exception {
		if(decimal < 0) {
			throw new Exception("Negative value");
		}
		try {
			if(decimal == 0) {
				return "0";
			}
			while (decimal >= 1) {
				stack.push(decimal % 2);
				decimal /= 2;
			}
			StringBuffer buffer = new StringBuffer();
			while (!stack.isEmpty()) {
				buffer.append(stack.pop());
			}
			return buffer.toString();
		} catch (Exception e) {
			return null;
		}
	}

}
