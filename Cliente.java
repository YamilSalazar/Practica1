import java.util.Collections;
import java.util.Comparator;

public class Cliente {

	//Atributos de la clase
	private String Name;
	private String Address;
	private String Correo;
	private float MetrosCuadrados;
	private float ValorPropiedad;
	private float ValorVenta;
	private String Telefono;
	private float Margen;
	
	//Constructor de la clase
	public Cliente(String nom,String dire, String email, float metCuad, float valorProp, float valorVta, String tel) {
		Name = nom;
		Address=dire;
		Correo=email;
		MetrosCuadrados = metCuad;
		ValorPropiedad = valorProp;
		ValorVenta = valorVta;
		Telefono = tel;
		Margen = valorVta-valorProp;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String nom) {
		Name = nom;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String dire) {
		Address = dire;
	}
	
	
	public String getCorreo() {
		return Correo;
	}
	
	public void setCorreo(String email) {
		Correo = email;
	}
	
	public float getMtsCuadrados() {
		return MetrosCuadrados;
	}
	
	public void setMtsCuadrados(long MtsCuad) {
		MetrosCuadrados = MtsCuad;
	}
	
	public float getValProp() {
		return ValorPropiedad;
	}
	
	public void setName(long valp) {
		ValorPropiedad = valp;
	}
	
	public float getValVta() {
		return ValorVenta;
	}
	
	public void setValVta(long ValorVta) {
		ValorVenta = ValorVta;
	}
	
	public String getTelefono() {
		return Telefono;
	}
	
	public void setTel(String newTel) {
		Telefono = newTel;
	}
	
	public float getMargen() {
		return Margen;
	}
	
	public String toString() {
		return "Nombre: " + this.getName()+"\n"+
			"Direccion: " + this.getAddress()+"\n"+
			"Correo: " + this.getCorreo()+"\n"+
			"MetrosCuadrados: " + this.getMtsCuadrados()+" m2\n"+
			"Valor de la Propiedad: $" + this.getValProp()+"\n"+
			"Valor de la Venta: $" + this.getValVta()+"\n"+
			"Telefono: " + this.getTelefono()+"\n"+
			"Margen: $" + this.getMargen()+"\n"+
			"+++++++++++++++++++++++++++++++++++\n";
	}

	
}



