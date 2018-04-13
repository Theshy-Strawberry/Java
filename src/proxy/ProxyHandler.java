package proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.InvocationHandler;

public class ProxyHandler implements InvocationHandler {
	private ArithmeticCalculator   ArithmeticCalculator ;
	
	

	public ProxyHandler(proxy.ArithmeticCalculator arithmeticCalculator) {
		ArithmeticCalculator = arithmeticCalculator;
	}



	@Override
	public Object invoke(Object arg0, Method method, Object[] args) throws Throwable {
			
		return method.invoke(ArithmeticCalculator,args);
	}

}
