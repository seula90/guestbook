<%@page import="guestbookDao.GuestBookDao"%>
<%@page import="java.util.*"%>
<%@page import="guestbookVo.GuestBookVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");

	// 등록
	String name = request.getParameter("name");
	String pwd = request.getParameter("pass");
	String msg = request.getParameter("content");
	
	GuestBookVo vo = new GuestBookVo();
	vo.setName(name);
	vo.setPwd(pwd);
	vo.setMsg(msg);
	
	GuestBookDao dao = new GuestBookDao();
	dao.insert(vo);
	
	response.sendRedirect("/guestbook");
%>
