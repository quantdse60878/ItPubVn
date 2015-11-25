<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<!DOCTYPE html>
<title>Phone Detail</title>
</head>
<body>
	<!-- BEGIN HEADER CONTENT -->
	<jsp:include page="header.jsp" />
	<!-- END HEADER CONTENT -->

	<!-- BEGIN BODY CONTENT -->
	
	<!-- SEARCH BAR -->
	<!-- END SEARCH BAR -->
	
	<!-- MAIN CONTENT -->
	<c:set var="productDetail" value="${requestScope.productDetail}" />
    <div style="width: 90%; margin: auto;">
        <c:if test="${not empty productDetail}">
            <c:import url="WEB-INF/xsl/phoneDetail.xsl" var="xsldoc" />
            <x:transform xml="${productDetail}" xslt="${xsldoc}" />
        </c:if>
    </div>
    <!-- END MAIN CONTENT -->
    
	<!-- END BODY CONTENT -->

	<!-- BEGIN FOOTER CONTENT -->
	<!-- END FOOTER CONTENT -->
</body>
</html>