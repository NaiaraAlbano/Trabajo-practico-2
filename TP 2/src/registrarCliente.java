import java.util.ArrayList;

public class registrarCliente {
	public static ArrayList<Cliente>clientes = new ArrayList<>();
	
	
	public void MostrarClientes() {
		System.out.print("Cliente: \n");
		for(Cliente cliente: clientes) {
			System.out.print("\n"+cliente.getNombre() +cliente.getApellido());
		}
	}
}
