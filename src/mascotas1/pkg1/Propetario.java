
package mascotas1.pkg1;
 //yasser
import java.util.ArrayList;


    public class Propetario {
        private String nombre;
    private String documento;
    private String telefono;
    private ArrayList<Mascota> mascotas; 

    public Propetario(String nombre, String documento, String telefono) {
      
        setNombre(nombre);
        setDocumento(documento);
        setTelefono(telefono);
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public void mostrarInformacion() {
        System.out.println("👤 Propietario: " + nombre);
        System.out.println("🆔 Documento: " + documento);
        System.out.println("📞 Teléfono: " + telefono);
    }

    public void mostrarMascotas() {
        for (Mascota m : mascotas) {
            System.out.println();
            m.mostrarHistorial();
        }
    }

    public String getNombre() {
        return nombre;
    }

 
    public void setNombre(String nombre) {
      if (nombre != null && !nombre.trim().isEmpty()) {
        this.nombre = nombre.trim(); 
    } else {
        this.nombre = "Sin nombre"; 
        System.out.println(" Nombre inválido. Se asignó 'Sin nombre'.");
    }
    }

    public String getDocumento() {
        return documento;
    }

   
    public void setDocumento(String documento) {
      if (documento != null && documento.length() >= 5) {
        this.documento = documento;
    } else {
        System.out.println("️ El documento inválido. No se realizó ningún cambio.");
    }
    }

    public String getTelefono() {
        return telefono;
    }

   
    
    public void setTelefono(String telefono) {
        if (telefono != null && telefono.length() >= 7) {
        this.telefono = telefono;
    } else {
        System.out.println("El teléfono inválido. No se realizó ningún cambio.");
                }
    }

    public ArrayList<Mascota> getMascotas() {
        
        return new ArrayList<>(mascotas);
    }
//  
//    private String nombre;
//    private int documento;
//    private String telefono;
//    private ArrayList<Mascota> mascotas = new ArrayList<>();
//
//    public ArrayList<Mascota> getMascotas() {
//        return mascotas;
//    }
//
//    public void setMascotas(ArrayList<Mascota> mascotas) {
//        this.mascotas = mascotas;
//    }
//
//    public Propetario(String nombre, int documento, String telefono) {
//        this.nombre = nombre;
//        this.documento = documento;
//        this.telefono = telefono;
//    }
//    public void agregarMascota(Mascota mascota) {
//     
//    
//            
//    }
//public void mostrarinformacionCompleta(){
//    
//    
//    
//}
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public int getDocumento() {
//        return documento;
//    }
//
//    public void setDocumento(int documento) {
//        this.documento = documento;
//    }
//
//    public String getTelefono() {
//        return telefono;
//    }
//
//    public void setTelefono(String telefono) {
//        this.telefono = telefono;
//    }
//            

    }