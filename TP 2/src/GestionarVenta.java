import java.util.Scanner;

public class GestionarVenta {

	public static void main(String[] args) {
		System.out.println("\n***** REGISTRO DE VENTA ***** ");
		System.out.println("\n-->DATOS DEL CLIENTE ");
		System.out.println("Nombre:");
		Scanner personaNom = new Scanner(System.in); 
		String nombre = personaNom.nextLine();
		
		System.out.println("Apellido:");
		Scanner personaApel = new Scanner(System.in); 
		String apellido = personaApel.nextLine();
		
		System.out.println("Empresa:");
		Scanner empresa = new Scanner(System.in); 
		String nombreEmpresa = empresa.nextLine();
		
		System.out.println("Direccion obra:");
		Scanner direccion = new Scanner(System.in); 
		String direcObra = direccion.nextLine();
		
		System.out.println("Correo electronico:");
		Scanner correo = new Scanner(System.in); 
		String email = correo.nextLine();
		
		System.out.println("Telefono:");
		Scanner telefono = new Scanner(System.in); 
		String numTel = telefono.nextLine();
		
		
		registrarMaterial registrar = new registrarMaterial();
		registrar.registroMaterial();
		
		registrarEspesor espesor = new registrarEspesor();
		espesor.mostrarEspesor();
		
		System.out.println("\n--> Seleccione un espesor: ");
		Scanner espeso = new Scanner(System.in);
		String espesorIngresado = espeso.nextLine();
		Integer posicionEspesor = Integer.parseInt(espesorIngresado)-1;
		
		System.out.println("\n-->Ingrese la cantidad de metros cuadrados: ");
		Scanner mts = new Scanner(System.in);
		String metrosIngresados = mts.nextLine();
		Double metrosCuadrados = Double.parseDouble(metrosIngresados);
		
		System.out.println("\n------------ PRESUPUESTO ------------");
		
		double cantBolsas;
		cantBolsas=metrosCuadrados/4.5;
		System.out.println("Se necesitan "+cantBolsas+" bolsas para el espesor indicado");
		
		double precioCotizacion=0;
		
		switch(posicionEspesor) {
			case 0:
				precioCotizacion=cantBolsas*53.60;
				System.out.print("El precio total es $ "+precioCotizacion);
				break;
				
			case 1:
				precioCotizacion=cantBolsas*87.00;
				System.out.print("El precio total es $ "+precioCotizacion);
				break;
				
			case 2:
				precioCotizacion=cantBolsas*117.49;
				System.out.print("El precio total es $ "+precioCotizacion);
				break;
				
			case 3:
				precioCotizacion=cantBolsas*128.48;
				System.out.print("El precio total es $ "+precioCotizacion);
				break;
				
			case 4:
				precioCotizacion=cantBolsas*143.05;
				System.out.print("El precio total es $ "+precioCotizacion);
				break;
				
			case 5:
				precioCotizacion=cantBolsas*180.79;
				System.out.print("El precio total es $ "+precioCotizacion);
				break;
		}
		
}
}
