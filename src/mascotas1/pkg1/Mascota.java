/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotas1.pkg1;
//yasser 
public class Mascota {
   
    private String nombre;
    private String especie;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }
    

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println("Mascota" + nombre);
        
    }
}




