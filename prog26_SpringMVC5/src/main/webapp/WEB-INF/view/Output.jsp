<%@page isELIgnored="false" %>


<html>
<body>

<h1>
--- Accessed by ignoring Expression Language ---
<br>My Id=${id }
<br>My name=${name}
<br>My Id=${add}
</h1>


<% 
String id= (String) request.getAttribute("id"); 
String name = (String) request.getAttribute("name"); 
String add = (String) request.getAttribute("add"); 
%>

<h1>
--- Accessed by using request object ---

<br>My Id = <%= id %>
<br>My Name =<%= name %>
<br>My Address =<%= add %>
<br>
</h1>

<h2><a href="">BACK</a></h2>
</body>
</html>
