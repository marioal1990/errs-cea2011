import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Pedido {

	Date fecha;
	List<PedidoLinea> lineasPedido = new ArrayList <PedidoLinea>();
	Cliente cliente = new Cliente (); 
	Boolean pagado;
	String tipoPago;


}
