package TestEntidades;

import java.util.List;

import Dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {
	
	public static void main(String[] args){
		//realizamos la respectiva instancia de las clases..
		TblProductocl2 producto= new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
		//asignamos valores
	/*	producto.setNombrecl2("Yogur Natural");
		producto.setPrecioventacl2(7);
		producto.setPreciocompcl2(5.5);
		producto.setEstadocl2("Vigente");
		producto.setDescripcl2("Yogur natural sin azúcar añadido");
		
		//invocamos metodo registrar
		crud.RegistrarProducto(producto);
		*/
		
		//TESTEAMOS EL METODO LISTADO
		List<TblProductocl2> listado=crud.ListadoProductocl2();
		
		//aplicamos un bucle for...
		for(TblProductocl2 lis:listado){
			
			//imprimiendo en pantalla
			System.out.println("nombre "+lis.getNombrecl2()+" PV "+lis.getPrecioventacl2()+" PC "+lis.getPreciocompcl2()+" estado "+lis.getEstadocl2()+" descrip"+lis.getDescripcl2());
			
		}
		
		
	} //FIN DEL METODO MAIN

}
