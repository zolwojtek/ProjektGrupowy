<spring:url value="${resource}" var="currentResourceValue" />
<c:choose>
	<c:when test="${fn:contains(resource, '.css')}">
		<link href="${currentResourceValue}" rel="stylesheet" />
	</c:when>
	<c:otherwise>
		<script type="text/javascript" src="${currentResourceValue}"></script>
	</c:otherwise>
</c:choose>