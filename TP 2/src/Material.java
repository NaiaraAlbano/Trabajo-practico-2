
public class Material {
	String nombreMaterial;
	int codigo;
	float precio;
	
	public Material(String nombreMaterial, int codigo, float precio) {
		this.nombreMaterial=nombreMaterial;
		this.codigo=codigo;
	}

	public String getNombreMaterial() {
		return nombreMaterial;
	}

	public void setNombreMaterial(String nombreMaterial) {
		this.nombreMaterial = nombreMaterial;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	

}
