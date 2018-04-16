package proxy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;

public class ProxyCaculator {

	
	private ArithmeticCalculator target;
	
	
	public ProxyCaculator(ArithmeticCalculator target) {
		this.target = target;
	}

	public ProxyCaculator() {
		super();
	}

	public ArithmeticCalculator getProxyClass() {
		ArithmeticCalculator proxy;
		ClassLoader classLoader = target.getClass().getClassLoader();
		 Class[]  intefaces = new Class[]{ArithmeticCalculator.class};
		 
		 InvocationHandler handler = new InvocationHandler() {
			
			@Override
			public Object invoke(Object a, Method method, Object[] arg2) throws Throwable {
				// TODO Auto-generated method stub
//				int[] data = {1,2,3,4,5};
				System.out.println("begin zzss "+method.getName()+":"+Arrays.asList(arg2));
				Object result=method.invoke(target, arg2);
				
				return result;
			}
		};
		
		
		
		proxy= (ArithmeticCalculator) Proxy.newProxyInstance(classLoader, intefaces, handler);
		
		return proxy;
	}

}
