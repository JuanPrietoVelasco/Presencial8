/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Online7_8;

/**
 *
 * @author juans
 */
public class Cliente implements Comparable<Cliente>{
    
    private String dni;
    private String nombre;
    private String direccion;
    private String localidad;
    private String codigoPostal;
    
    
    public Cliente(String dni, String nombre, String direccion, String localidad, String codigo){
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.codigoPostal = codigo;
    }
    
    public Cliente(Cliente cliente){
        this.dni = cliente.dni;
        this.nombre = cliente.nombre;
        this.direccion = cliente.direccion;
        this.localidad = cliente.localidad;
        this.codigoPostal = cliente.codigoPostal;
        
    }
    
    public String getDni(){
        return this.dni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDireccion(){
        return this.direccion;   
    }
    
    public String getLocalidad(){
        return this.localidad;
    }
    
    public String getCodigoPostal(){
        return this.codigoPostal;
    }
    
    //Corregido
    public String escribirFichero(){
        
        return this.dni+"#"+this.nombre+"#"+this.direccion+"#"+this.localidad+"#"+this.codigoPostal+"\n";
    }
    
   
    @Override
    public String toString(){
        return "\nDni/Nie: "+this.dni +"\t\tNombre:  "+ this.nombre +"\t\tDirección:  "+ this.direccion +"\t\tLocalidad: "+ this.localidad +"\t\tCódigo postas: "+ this.codigoPostal;
    }

    @Override
    public int compareTo(Cliente c) {
        
        if(this.dni.compareToIgnoreCase(c.getDni()) > 0){
            return 1;
        }else if(this.dni.compareToIgnoreCase(c.getDni()) < 0){
            return -1;
        }
        return 0;
     
    }
    
    
}

    

    

