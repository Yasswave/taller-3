
package mascotas1.pkg1;
//yasser 
public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;
    
    private Historial historial;
    // Historial médico de la mascota
    public Mascota(String nombre, String especie, int edad) {
        //asigno el nombre usando el setter
        setNombre(nombre);//guarda el nombre desues de la validacion 
        setEspecie(especie);// // Guarda la especie después 
        setEdad(edad);// Guarda la edad 
        this.historial = new Historial();
    }

    public void agregarConsulta(Consulta consulta) {
       
        historial.agregarConsulta(consulta); 
    }

    public void mostrarHistorial() {// Mostramos info básica de la mascota
        System.out.println("📋 Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad + " años");//muestra la información básica de la mascota
        System.out.println("Historial de consultas:");
      
        historial.mostrarConsultas(); 
    }

  
    public void setNombre(String nombre) {
      if (nombre != null && !nombre.isBlank()) {
      
    this.nombre = nombre.trim();
    // Si el nombre es válido, se asigna
} else {
    System.out.println("El Nombre inválido. No se realizó ningún cambio.");
}
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.isBlank()) {
            // Si la especie es nula o vacía, lanza un error
            throw new IllegalArgumentException("Especie inválida.");
        }
        this.especie = especie;//si es valida de asigna 
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("Edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public String getNombre() {
        //getter de el nombre
        return nombre;
    }

    public String getEspecie() {
        //getter de la especie 
        return especie;
    }

    public int getEdad() {
        //getter de la edad
        return edad;
    }
   
//    private String nombre;
//    private String especie;
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getEspecie() {
//        return especie;
//    }
//
//    public void setEspecie(String especie) {
//        this.especie = especie;
//    }
//
//    public Mascota(String nombre, String especie) {
//        this.nombre = nombre;
//        this.especie = especie;
//    }
//    
//
//    public Mascota(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public void mostrarInfo() {
//        System.out.println("Mascota" + nombre);
//        
//    }
}




