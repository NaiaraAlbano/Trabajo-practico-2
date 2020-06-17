import java.util.ArrayList;
public class registrarEspesor {
	public static  ArrayList <Espesor> espesores = new ArrayList <>();
	
	public registrarEspesor() {
		espesores.add(new Espesor("Aislante pared 9mm", 53.60));
		espesores.add(new Espesor("Aislante pared 70mm", 87.00));
		espesores.add(new Espesor("Aislante pared 100mm", 117.49));
		espesores.add(new Espesor("Aislante pared 120mm", 128.48));
		espesores.add(new Espesor("Aislante pared 160mm", 143.05));
		espesores.add(new Espesor("Aislante pared 200mm", 180.79));
	}
	
	public void mostrarEspesor() {
		System.out.println("------ LISTA DE MATERIALES ------");
		int pos=1;
		for (Espesor espe: espesores){
			System.out.print(pos +"- " + espe.getDetalle() + " $" +espe.getPrecio() + "\n");
			
			pos++;
		}
	}
}
