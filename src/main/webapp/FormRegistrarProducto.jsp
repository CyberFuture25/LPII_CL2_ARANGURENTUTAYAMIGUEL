<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Producto</title>
</head>
<body>
<form action="ControladorProducto" method="post">
<table border="2" align="center">
<tr>
<td>Nombre</td>
<td><input type="text" name="nombre"></td>
</tr>

<tr>
<td>Precio</td>
<td><input type="text" name="precio"></td>
</tr>

<tr>
<td>PrecioVen</td>
<td><input type="text" name="PrecioVenta"></td>
</tr>

<tr>
<td>Estado</td>
<td><select name="estado" >
            <option value="1">Vigente</option>
            <option value="2">Caducado</option>
        </select>
</td>
</tr>

<tr>
<td>Descrip</td>
<td><input type="text" name="Descrip" size="30"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="Registrar">
</td>
</tr>

 
</table>


</form>

</body>
</html>