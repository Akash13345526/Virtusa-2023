<%@page import="jspmain.UserDao"%>  
<jsp:useBean id="u" class="jspmain.bean.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
UserDao.delete(u);  
response.sendRedirect("viewusers.jsp");  
%>  
