package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// HttpServlet是所有自己写的Servlet服务器小程序的父类，必须继承这个类，才行
public class FirstServletOne extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request.getParameter("name");意思是：接受请求发来的参数
		String name = request.getParameter("name");
		// 拼凑了一个包含name参数的字符串；这个字符串符合HTML格式，以方便浏览器解析显示
		String html = "<h1 style='color:red'>hi,"+name+"!</h1><hr/>";
		// 这个输出语句，没什么用，就是为了帮助理解程序
		System.out.println("返回给浏览器的响应数据为："+html);
		// response.getWriter();或获得从服务器向浏览器返回的输出流；下面我们可以通过out这个对象，将html发送回浏览器；
		PrintWriter out = response.getWriter();
		// out.println(html);意思是，将html发送回浏览器
		out.println(html);	
	}
}
