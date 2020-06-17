import java.util.ArrayList;

public class registrarMaterial {
	public static ArrayList<Material>materiales = new ArrayList<>();
	
	public void MostrarClientes() {
		System.out.print("Cotizador \n");
		System.out.print("Lista de precios \n");
		int pos=1;
		for(Material mat: materiales) {
			System.out.print(pos +"-" + mat.getNombreMaterial() + "$" + mat.getPrecio());
		}
	}
}
