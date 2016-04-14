<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<spring:url value="/resources/Site.css" var="siteCss" />
<spring:url value="/resources/jquery-1.8.2.min.js" var="jqueryJs" />
<spring:url value="/resources/jquery-ui-1.8.24.min.js" var="jqueryUiJs" />

<link href="${mainCss}" rel="stylesheet" />
<script src="${jqueryJs}"></script>
<script src="${jqueryUiJs}"></script>

<c:forEach var="resource" items="${jqueryUiStyleBundle}">
	<%@ include file="/WEB-INF/views/resourceBundleItem.jsp"%>
</c:forEach>

<title>Test</title>
</head>
<body>
	<h1>Hello World!</h1>

	<c:if test="${not empty list}">
		<c:forEach var="task" items="${list}">
			<%@ include file="/WEB-INF/views/task/taskView.jsp"%>
		</c:forEach>
	</c:if>
</body>
</html>