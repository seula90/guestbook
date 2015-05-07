<%@page import="guestbookDao.GuestBookDao"%>
<%@page import="java.util.*"%>
<%@page import="guestbookVo.GuestBookVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
	// 삭제
	Long no = Long.parseLong(request.getParameter("no"));
	String pwd = request.getParameter("password");
		
	GuestBookVo vo = new GuestBookVo();
	
	vo.setNo(no);
	vo.setPwd(pwd);
		
	
	GuestBookDao dao = new GuestBookDao();
	dao.delete(vo);
	
	response.sendRedirect("/guestbook");
%>
