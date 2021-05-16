package pe.edu.upeu.soap.ws.util;

import pe.edu.upeu.soap.ws.dao.ClienteDao;
import pe.edu.upeu.soap.ws.daoImpl.ClienteDaoImpl;

public class test {
	
	public static void main(String[] args) {
		if(Conexion.getConexion()!=null) {
			System.out.println("conectado");
		}else {
			System.out.println("Error");
		}
	
		ClienteDaoImpl cliente =  new ClienteDaoImpl();
		System.out.println(cliente.readVenta("2021-05-04", "2021-05-10", 1).getNombre());
		
		
		
	}
	
	
	
	
}
