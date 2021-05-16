package pe.edu.upeu.soap.ws.cliente;

import pe.edu.upeu.soap.ws.dao.ClienteDao;
import pe.edu.upeu.soap.ws.daoImpl.ClienteDaoImplService;

public class ClienteService {
public static void main(String[] args) {
	ClienteDaoImplService pds = new ClienteDaoImplService();
	pe.edu.upeu.soap.ws.daoImpl.ClienteDao pd = pds.getClienteDaoImplPort();
	

	
	System.out.println("Fech " + pd.readVenta("2021-05-04", "2021-05-10", 1).getFecha());
	System.out.println("Nombre " + pd.readVenta("2021-05-04", "2021-05-10", 1).getNombre());
	System.out.println("Dirección " + pd.readVenta("2021-05-04", "2021-05-10", 1).getDireccion());
	System.out.println("Dni " + pd.readVenta("2021-05-04", "2021-05-10", 1).getDni());
	System.out.println("Producto " + pd.readVenta("2021-05-04", "2021-05-10", 1).getProducto());
	System.out.println("Documento " + pd.readVenta("2021-05-04", "2021-05-10", 1).getDocumento());
	System.out.println("Número " + pd.readVenta("2021-05-04", "2021-05-10", 1).getNumero());
	System.out.println("Cantidad " + pd.readVenta("2021-05-04", "2021-05-10", 1).getCantidad());
	System.out.println("Stock " + pd.readVenta("2021-05-04", "2021-05-10", 1).getStock());
	System.out.println("Subtotal " + pd.readVenta("2021-05-04", "2021-05-10", 1).getSubtotal());
}
}
