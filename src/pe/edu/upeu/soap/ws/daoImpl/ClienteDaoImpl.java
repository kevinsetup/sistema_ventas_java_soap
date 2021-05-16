package pe.edu.upeu.soap.ws.daoImpl;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.jws.WebService;


import java.sql.Connection;
import java.sql.PreparedStatement;




import pe.edu.upeu.soap.ws.dao.ClienteDao;
import pe.edu.upeu.soap.ws.entity.Cliente;
import pe.edu.upeu.soap.ws.util.Conexion;


@WebService(endpointInterface = "pe.edu.upeu.soap.ws.dao.ClienteDao")
public class ClienteDaoImpl implements ClienteDao {
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx;
	@Override
	public Cliente readVenta(String fecha_ini, String fecha_fin, int id) {
		Cliente client = new Cliente();


		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement("Select fecha,nombre, direccion ,  dni ,  p.nomprodu producto, tipodoc documento , numdoc numero ,  "
					+ " cantidad, stock, subtotal  from detalle_venta d join ventas v on v.idventa = d.idventa "
					+ " join producto p on p.idproducto = d.idproducto join cliente c "
					+ " on v.idcliente = c.idcliente where"
					+ " c.idcliente = ? and v.fecha >= ?  and v.fecha <= ? ");
			ps.setInt(1, id);
			ps.setString(2, fecha_ini);
			ps.setString(3, fecha_fin);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				
					client.setFecha(rs.getString("fecha"));
					client.setNombre(rs.getString("nombre"));
					client.setDireccion(rs.getString("direccion"));
					client.setDni(rs.getString("dni"));
					client.setProducto(rs.getString("producto"));
					client.setDocumento(rs.getString("documento"));
					client.setNumero(rs.getString("numero"));
					client.setCantidad(rs.getString("cantidad"));
					client.setStock(rs.getString("stock"));
					client.setSubtotal(rs.getString("subtotal"));	
				
				/*
					String fecha = rs.getString("fecha");
					String nombre = rs.getString("nombre");
					String direccion = rs.getString("direccion");
					String dni = rs.getString("dni");
					String producto = rs.getString("producto");
					String documento = rs.getString("documento");
					String numero = rs.getString("numero");
					String cantidad = rs.getString("cantidad");
					String stock = rs.getString("stock");
					String subtotal = rs.getString("subtotal");
					*/
					
					//reporte.add(new Object[] {fecha, nombre, direccion, dni, producto, documento, numero, cantidad, stock, subtotal});

					
			}
						
		} catch (Exception e) {
			System.out.println(e);
		}					
		return client;
	}
	

	
}
