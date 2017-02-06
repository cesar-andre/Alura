<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
Resultado da busca:

<ul>
<c:forEach items="${empresas}" var="empresa">
	<li>${empresa.id }: ${empresa.nome }</li>
</c:forEach>
</ul>
</body>
</html>