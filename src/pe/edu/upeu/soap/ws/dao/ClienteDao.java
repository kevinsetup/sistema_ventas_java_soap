package pe.edu.upeu.soap.ws.dao;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pe.edu.upeu.soap.ws.entity.Cliente;

import java.util.ArrayList;




@WebService
public interface ClienteDao {
	@WebMethod
	public Cliente readVenta(String fecha_ini, String fecha_fin, int id);



}
