/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import java.util.Scanner;
import Modelo.Paciente;
import Modelo.HistorialMedico;
import java.time.*;
/**
 *
 * @author mateo
 */
public class MenuPaciente1 {
    public Paciente displayMenu()
    {
        Scanner entrada = new Scanner (System.in);
        System.out.println("PACIENTE");
        System.out.println(" Digite el nombre: ");
        System.out.print("  >> ");
        String nombre = entrada.nextLine();

        System.out.println(" Digite la edad: ");
        System.out.print("  >> ");
        int edad = entrada.nextInt();
        

        System.out.println(" Digite su genero: ");
        System.out.print("  >> ");
        String genero = entrada.nextLine();
        
        System.out.println(" Digite el id: ");
        System.out.print("  >> ");
        int id = entrada.nextInt();
        

        System.out.println("***DIGITE EL HISTORIAL MEDICO*** ");
        System.out.println("   ");

        System.out.println(" Ingrese el diagnóstico:");
        System.out.print("  >> ");
        String diagnostico = entrada.nextLine();
       
        System.out.println(" Ingrese los tratamientos:");
        System.out.print("  >> ");
        String tratamientos = entrada.nextLine();
        
        System.out.println(" Ingrese las alergias:");
        System.out.print("  >> ");
        String alergias = entrada.nextLine();
        
        HistorialMedico historialMedico = new HistorialMedico(diagnostico, tratamientos, alergias);
        
        Paciente paciente = new Paciente(nombre,edad, genero,historialMedico, id);
        
        return paciente;
    }
}
