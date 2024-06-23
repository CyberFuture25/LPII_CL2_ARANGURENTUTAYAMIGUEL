package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl2;

public class ClassProductoImp implements IProducto{

	public void RegistrarProductocl2(TblProductocl2 producto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ARANGURENTUTAYAMIGUEL");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(producto);
		System.out.println("Producto registrado correctamente");
		em.getTransaction().commit();
		em.close();
	}

	public void ActualizarProductocl2(TblProductocl2 producto) {
		// TODO Auto-generated method stub
		
	}

	public void EliminarProductocl2(TblProductocl2 producto) {
		// TODO Auto-generated method stub
		
	}

	public TblProductocl2 BuscarProductocl2(TblProductocl2 producto) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TblProductocl2> ListadoProductocl2() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ARANGURENTUTAYAMIGUEL");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		List<TblProductocl2> listado = em.createQuery("SELECT c FROM TblProductocl2 c",TblProductocl2.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return listado;
	
	}//FIN DEL METODO LISTADO

	}


