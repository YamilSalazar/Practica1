import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

import com.csvreader.CsvReader;

public class Consulta {
	
	 public static void main(String[] args) {
	     
	    	List<Cliente> ListaCliente = new ArrayList<Cliente>();
	    	List<Float> ListaPropiedades1=new ArrayList<Float>();
	    	List<String> ListaNombreC = new ArrayList<String>();
	    	List<Float> ListaMargen = new ArrayList<Float>();
	    	int contador =0;
	    	int cp =0;
	        try {
	         
	        CsvReader mi_csv = new CsvReader("C:\\Users\\Pedro Yamil Salazar\\eclipse-workspace\\P1\\P1.csv"); //Cambien a la ruta de su archivo
	        mi_csv.readHeaders(); // Leemos las Cabeceras, las cuales nos dan informacion de cada campo
	         
	        while (mi_csv.readRecord())
	        {
	        	
	        	
	        	
	            String nombre = mi_csv.get(0);
	            String tel = mi_csv.get(1);
	            String direccion = mi_csv.get(2);
	            String correo = mi_csv.get(3);
	            String m2 = mi_csv.get(4);
	            String val_prop = mi_csv.get(5);
	            String val_venta = mi_csv.get(6);
	            
	            float new_m2 = Float.parseFloat(m2);
	            float new_val_prop =Float.parseFloat(val_prop);
	            float new_val_venta = Float.parseFloat(val_venta);
	            
	            Cliente cliente = new Cliente(nombre,direccion,correo,new_m2,new_val_prop,new_val_venta,tel);
	            
	            System.out.println("Registro leido");
	            System.out.println("Nombre: "+nombre);
	            System.out.println("Télefono: "+tel); 
	            System.out.println("Dirección: "+direccion);             
	            System.out.println("Correo: "+correo);     
	            System.out.println("Metros Cuadrados: "+m2+" m^²"); 
	            System.out.println("Valor de la Propiedad: $"+val_prop); 
	            System.out.println("Valor para Venta: $"+val_venta);
	            System.out.println("/***********************************/\n");
	            
	            ListaCliente.add(cliente);
	            ListaNombreC.add(nombre);
	            ListaPropiedades1.add(new_val_prop);
	            ListaMargen.add(cliente.getMargen());
	            
	            
	            if(cliente.getMtsCuadrados()<=200 && (cliente.getValProp()>=50 && cliente.getValProp()<=500)) {
	            	contador++;
	            	//ListaPropiedades1.add(cliente);
	            }
	            cp = cp+ cliente.getAddress().indexOf("2824");
	        }
	        
	        	System.out.println(ListaCliente);
	        	System.out.println("Las propiedades que cumplen 1 son: "+contador);
	        	Set<String> quipu =new HashSet<String>(ListaNombreC);
	        	for(String key : quipu) {
	        		if(Collections.frequency(ListaNombreC, key)>1) {
	        			System.out.println(key + " : " + Collections.frequency(ListaNombreC, key));
	        		}
	        	}
	        	
	        	Collections.sort(ListaPropiedades1);
	        	for(int i=0;i<10;i++) {
	        		System.out.println(ListaPropiedades1.get(i));
	        	}
	        	
	        		System.out.println("++++++++++++++++++++++++++++++++\n");
	        	
	        	Comparator<Float> comparador = Collections.reverseOrder();
	        	Collections.sort(ListaPropiedades1, comparador);
	        	
	        	for(int i=0;i<5;i++) {
	        		System.out.println(ListaPropiedades1.get(i));
	        	}
	        	System.out.println("++++++++++++++++++++++++++++++++\n");
	        	
	        	
	        	Collections.sort(ListaMargen,comparador);
	        	for(int i=0;i<5;i++) {
	        		System.out.println(ListaMargen.get(i));
	        	}
	        	System.out.println("++++++++++++++++++++++++++++++++\n");
	        	if(cp<-1) {
	        		System.out.println("Si existen propiedades en el C.P. 2824");
	        	}
	        	
	        	
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
