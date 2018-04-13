package proxy;


import java.io.FileOutputStream;

import org.junit.Test;

import net.sf.cglib.proxy.Proxy;
import sun.misc.ProxyGenerator;

public class _Junit_ProxyMain {

	@Test
	public void testProxyCaculator() {
		ArithmeticCalculator  tag = new ArithmeticCalculatorImpl();
		ArithmeticCalculator  proxy = new ProxyCaculator(tag).getProxyClass();
		proxy.jia(3, 7);
	}

	
	@Test
	  public  void main( String args[] )   
	  {   
	    ArithmeticCalculatorImpl real = new ArithmeticCalculatorImpl();   
	    ArithmeticCalculator proxyArithmeticCalculator = (ArithmeticCalculator)Proxy.newProxyInstance(ArithmeticCalculator.class.getClassLoader(), 
	     new Class[]{ArithmeticCalculator.class}, 
	     new ProxyHandler(real));
	         
	    proxyArithmeticCalculator.jia(9,8);
	   
	    //write proxyArithmeticCalculator class binary data to file   
	    createProxyClassFile();   
	  }   
	     
	  public static void createProxyClassFile()   
	  {   
	    String name = "ProxyArithmeticCalculator";   
	    byte[] data = ProxyGenerator.generateProxyClass(name, new Class[] { ArithmeticCalculator.class } );   
	    try  
	    {   
	      FileOutputStream out = new FileOutputStream( name + ".class" );   
	      out.write( data );   
	      out.close();   
	    }   
	    catch( Exception e )   
	    {   
	      e.printStackTrace();   
	    }   
	  }   
	}  
