package Interfaces;

import java.util.List;

import model.TblProductocl2;

public interface IProducto {
	
	//declaracion de metodos
	public void RegistrarProductocl2(TblProductocl2 producto);
	public void ActualizarProductocl2(TblProductocl2 producto);
	public void EliminarProductocl2(TblProductocl2 producto);
	public TblProductocl2 BuscarProductocl2(TblProductocl2 producto);
	public List<TblProductocl2> ListadoProductocl2();


}
