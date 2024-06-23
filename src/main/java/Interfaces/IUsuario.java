package Interfaces;



import model.TblUsuariocl2;

public interface IUsuario {
	//declaracion de metodos
	TblUsuariocl2 ValidarUsuario(String usuario, String password);

}
