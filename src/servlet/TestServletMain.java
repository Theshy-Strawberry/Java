package servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestServletMain implements Servlet {

	public TestServletMain() {
		// TODO Auto-generated constructor stub
		System.out.println("?constructor");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("getServletConfig");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo");
		return null;
	}

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		//System.out.println("获取参数的"+servletConfig.getInitParameter("user"));
//		Enumeration<String> paramAll = servletConfig.getInitParameterNames();
//		while(paramAll.hasMoreElements()){
//			System.out.println("name  "+paramAll.nextElement());
//		}
		
		ServletContext context= servletConfig.getServletContext();
		String path=context.getRealPath(("/servlet/TestServlet.java"));
		System.out.println(path);
		System.out.println(context.getContextPath());
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service");
	}

}
