/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import java.util.Scanner;
import Modelo.Medico;
import java.time.*;

/**
 *
 * @author mateo
 */
public class MenuMedico1 {
    
    LocalTime inicio, finalizacion;
    int hora1, hora2;
    int minuto1, minuto2;
    
    public Medico displayMenu()
    {
        Scanner entrada = new Scanner (System.in);
        System.out.println("MEDICO");
        System.out.println(" Digite el nombre: ");
        System.out.print("  >> ");
        String nombre = entrada.nextLine();

        System.out.println(" Digite la especialidad: ");
        System.out.print("  >> ");
        String especialidad = entrada.nextLine();
        

        System.out.println(" Digite el id: ");
        System.out.print("  >> ");
        int numeroid = entrada.nextInt();
        

        System.out.println("Digite unicamente la hora de entrada:");
        System.out.print(">>");
        hora1 = entrada.nextInt();
        
        
        
        System.out.println("Digite los minutos:");
        System.out.print(">>");
        minuto1 = entrada.nextInt();
        
        
        System.out.println("Digite la hora de salida:");
        System.out.print(">>");
        hora2 = entrada.nextInt();
        
        System.out.println("Digite los minutos:");
        System.out.print(">>");
        minuto2 = entrada.nextInt();
        
        inicio = LocalTime.of(hora1, minuto1);
        finalizacion = LocalTime.of(hora2, minuto2);
        

        Medico medico = new Medico(nombre, especialidad,numeroid,inicio,finalizacion);
        return medico;
    }  
}
