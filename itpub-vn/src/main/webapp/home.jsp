<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home page</title>
</head>
<body>

	<!-- END HEADER CONTENT -->
	<jsp:include page="header.jsp"/>
	<!-- BEGIN BODY CONTENT -->
	
	<!-- SEARCH BAR -->
	<!-- END SEARCH BAR -->
	
	<c:set var="dataList" value="${requestScope.dataList}" />
	<div style="width: 90%; margin: auto;">
		<c:if test="${not empty dataList}">
			<c:import url="WEB-INF/xsl/phoneList.xsl" var="xsldoc" />
			<x:transform xml="${dataList}" xslt="${xsldoc}" />
		</c:if>
	</div>
	<!-- BEGIN BODY CONTENT -->
	
	<!-- BEGIN FOOTER CONTENT -->
	<!-- END FOOTER CONTENT -->
</body>
</html>