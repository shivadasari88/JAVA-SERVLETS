package demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletRequest res) {
		int i = Integer.parseInt("num1");
		int j = Integer.parseInt("num2");
		
		int z = i+j;
		System.out.println("result is "+ z);
	}
}
