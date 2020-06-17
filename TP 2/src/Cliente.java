
public class Cliente {
	//atributos
	String nombre;
	String apellido;
	String empresa;
	String direccionObra;
	String email;
	String telefono;
	
	//constructores
	public Cliente(String nombre, String apellido, String empresa, String direccionObra, String email, String telefono) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.empresa=empresa;
		this.direccionObra=direccionObra;
		this.email=email;
		this.telefono=telefono;
	}
	
	//metodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDireccionObra() {
		return direccionObra;
	}

	public void setDireccionObra(String direccionObra) {
		this.direccionObra = direccionObra;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void registrar() {
		
	}
}
