package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// HttpServlet�������Լ�д��Servlet������С����ĸ��࣬����̳�����࣬����
public class FirstServletOne extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request.getParameter("name");��˼�ǣ������������Ĳ���
		String name = request.getParameter("name");
		// ƴ����һ������name�������ַ���������ַ�������HTML��ʽ���Է��������������ʾ
		String html = "<h1 style='color:red'>hi,"+name+"!</h1><hr/>";
		// ��������䣬ûʲô�ã�����Ϊ�˰���������
		System.out.println("���ظ����������Ӧ����Ϊ��"+html);
		// response.getWriter();���ôӷ���������������ص���������������ǿ���ͨ��out������󣬽�html���ͻ��������
		PrintWriter out = response.getWriter();
		// out.println(html);��˼�ǣ���html���ͻ������
		out.println(html);	
	}
}
