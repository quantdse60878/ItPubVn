<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<title>Phone Detail</title>
</head>
<body>
	<!-- END HEADER CONTENT -->
	<jsp:include page="header.jsp" />
	<!-- BEGIN BODY CONTENT -->

	<!-- BEGIN BODY CONTENT -->
	<c:set var="productDetail" value="${requestScope.productDetail}" />
    <div style="width: 90%; margin: auto;">
        <c:if test="${not empty dataList}">
            <c:import url="WEB-INF/xsl/phoneDetail.xsl" var="xsldoc" />
            <x:transform xml="${productDetail}" xslt="${xsldoc}" />
        </c:if>
    </div>
	<!-- END BODY CONTENT -->

	<!-- BEGIN FOOTER CONTENT -->
	<!-- END FOOTER CONTENT -->
</body>
</html>