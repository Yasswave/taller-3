
package mascotas1.pkg1;
 //yasser
import java.util.ArrayList;


    public class Propetario {
  
    private String nombre;
    private int documento;
    private String telefono;
    private ArrayList<Mascota> mascotas = new ArrayList<>();

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public Propetario(String nombre, int documento, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
    }
    public void agregarMascota(Mascota mascota) {
     
    
            
    }
public void mostrarinformacionCompleta(){
    
    
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
            

    }