<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<!DOCTYPE html PUBLIC
	"-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
<title></title>
</head>
<body>
	<html:form method="post" action="action1.do">
		<html:text property="text1" readonly="true" size="40" />
		<br />
		<html:text property="field1" />
		<br />
		<html:submit value="OK" />
	</html:form>
</body>
</html:html>
