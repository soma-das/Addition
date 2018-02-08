package sd.addition.addition.component;

import no.ntnu.item.arctis.runtime.Block;

public class Component extends Block {

	public int inputA() {
		
		int a = 10;
		return a;
		
		
	}

	public int inputB() {
		
		int b = 20;
		return b;
		
	}

	public void addAB(int a, int b) {
		
		int addition;
		
		addition = a + b;
		
		System.out.println(" The sum of static integer values of A and B is " + addition);
		
	}

}
