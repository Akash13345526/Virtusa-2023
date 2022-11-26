<%@page import="jspmain.UserDao"%>  
<jsp:useBean id="u" class="jspmain.bean.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=UserDao.update(u);  
response.sendRedirect("viewusers.jsp");  
%>  