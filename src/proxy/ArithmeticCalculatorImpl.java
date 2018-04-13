package proxy;

public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

	@Override
	public int jia(int a, int b) {
		return a+b;
	}

	@Override
	public int jian(int a, int b) {
		return a-b;
	}

	@Override
	public int cheng(int a, int b) {
		return a*b;
	}

	@Override
	public int chu(int a, int b) {
		return a/b;
	}

}
