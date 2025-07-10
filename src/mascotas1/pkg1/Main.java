
package mascotas1.pkg1;

import java.util.Scanner;

/**
 *
 * @author MI PC
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
            System.out.println ("===Registro del Propietario===");
            System.out.print("Nombre:");
            String nombreProp = sc.nextLine();

            System.out.print("Documento:");
            String documento = sc.nextLine();

            System.out.print("Teléfono:");
            String telefono = sc.nextLine();

        Propetario propetario = new Propetario(nombreProp, documento, telefono);// declaro y le pongo para q ejecute los atributos
     
        System.out.print("\n¿Cuántas mascotas desea registrar?: ");
        int numMascotas = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= numMascotas; i++) {
            //el for es para que empieze el ciclo
            System.out.println("\n---Mascota #" + i + "---");

            System.out.print("Nombre de la mascota:");
            String nombreMascota = sc.nextLine();

            System.out.print("Especie:");
            String especie = sc.nextLine();

            System.out.print("Edad:");
            int edad = Integer.parseInt(sc.nextLine());

        
            Mascota mascota = new Mascota(nombreProp, especie, edad);
            propetario.agregarMascota(mascota);

            // === Registro de Consultas ===
            System.out.print("¿Cuántas consultas desea agregar a esta mascota?: ");
            int numConsultas = Integer.parseInt(sc.nextLine());

            for (int j = 1; j <= numConsultas; j++) {
                System.out.println("-> Consulta #" + j);

               
                String codigo = IDGenerador.generarCodigoConsulta();

                System.out.print("Fecha (YYYY-MM-DD): ");
                //para que aparezca fecha, mes y dia 
                String fecha = sc.nextLine();

                System.out.println("Información del veterinario:");
                //System.out.println es para imprimir en la pantalla el texto que uno quiera
                System.out.print("Nombre: ");
                String nombreVet = sc.nextLine();

                System.out.print("Especialidad: ");
                String especialidad = sc.nextLine();

                Veterinario vet = new Veterinario(nombreVet, especialidad);
                Consulta consulta = new Consulta(codigo, fecha, vet);

                mascota.agregarConsulta(consulta);
            }
        }

        
        System.out.println("===== FICHA CLÍNICA COMPLETA =====");
        propetario.mostrarInformacion();
        propetario.mostrarMascotas();

        sc.close();
    }

}
