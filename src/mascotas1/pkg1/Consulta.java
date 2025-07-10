
package mascotas1.pkg1;
//yassser
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Consulta {
    private String codigo;
   
    private LocalDate fecha;
    private Veterinario veterinario;

    public Consulta(String codigo, String fecha, Veterinario veterinario) {
       
        setCodigo(codigo);
        setFecha(fecha);
        setVeterinario(veterinario);
    }

    public void mostrarConsulta() {
        System.out.println("Consulta Código: " + codigo);
        System.out.println("Fecha: " + fecha);
        if (veterinario != null) {
            veterinario.mostrarPerfil();
        } else {
            System.out.println("Sin veterinario asignado.");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Código inválido.");
        }
        this.codigo = codigo;
    }

 
    public LocalDate getFecha() { return fecha; }

    public void setFecha(String fechaTexto) {
        try {
            this.fecha = LocalDate.parse(fechaTexto); 
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Formato de fecha inválido.");
        }
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        if (veterinario == null) {
            throw new IllegalArgumentException("Veterinario requerido.");
        }
        this.veterinario = veterinario;
    }
//    private Veterinario veterinario;
//   private int codigo;
//   private String fecha;
//
//    public int getCodigo() {
//        return codigo;
//    }
//
//    public void setCodigo(int codigo) {
//        this.codigo = codigo;
//    }
//
//    public String getFecha() {
//        return fecha;
//    }
//
//    public void setFecha(String fecha) {
//        this.fecha = fecha;
//    }
//
//    public Veterinario getVeterinario() {
//        return veterinario;
//    }
//
//    public void setVeterinario(Veterinario veterinario) {
//        this.veterinario = veterinario;
//    }
   
}
