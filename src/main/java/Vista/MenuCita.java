/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import  Modelo.*;
import java.time.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
/**
 *
 * @author mateo
 */
public class MenuCita {
    
    LocalTime horaCita;
    LocalDate fechaCita;
    
    int hora;
    int minuto;
    
    int dia;
    int mes;
    int año;
    
    
    Scanner entrada = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    //Cita cita;
    
    int opcion=0;
   
    public int displayMenuCita()
    {   
        System.out.println("");
        System.out.println("Digite la opcion deseada");
        System.out.println("1. Asignar cita");
        System.out.println("2. Cancelar cita");
        System.out.println("3. Mostrar citas");
        System.out.println("4. Salir");
        System.out.print(" >>");
        opcion = entrada.nextInt();
        return opcion;
    }
    
    
    public void displayMenu (Cita cita)
    {   
        Scanner entrada1 = new Scanner(System.in);
    
        System.out.println("    ");
        System.out.println("***MENU CITA***");
        System.out.println("    ");
        System.out.println("Introducir fecha:");
        
        System.out.println("Digite el año");
        System.out.println(">>");
        año = entrada1.nextInt();
        
        System.out.println("Digite el numero del mes");
        System.out.print(">>");
        mes = entrada1.nextInt();
        
        System.out.println("Digite el dia");
        System.out.print(">>");
        dia = entrada1.nextInt();
        
        System.out.println("Asignar hora de la cita");
        System.out.println("Digite unicamente la hora");
        System.out.print(">>");
        hora = entrada1.nextInt();
        
        System.out.println("Digite unicamente los minuto");
        System.out.print(">>");
        minuto = entrada1.nextInt();
       
        System.out.println("Comentarios");
        System.out.print(">>");
        String comentario = entrada1.nextLine();
        
        fechaCita = LocalDate.of(año, mes, dia);
        horaCita = LocalTime.of(hora, minuto);
        
        cita.setFechaCita(fechaCita);
        cita.setHoraCita(horaCita);
        cita.setComentario(comentario);
        
     
    }
    
    public int mostrarMedico(ArrayList<Medico> medicos)
    {
        System.out.println("Seleccione el medico");
        int i=1;
        for(Medico item:medicos)
        {
            System.out.println(i+"."+item.getNombre());
            i++;
        }
        int opcion = entrada.nextInt();
        return opcion;
    }
    public int mostrarPacientes(ArrayList<Paciente> pacientes)
    {
        System.out.println("Seleccione el paciente");
        int i=1;
        for(Paciente item:pacientes)
        {
            System.out.println(i+"."+item.getNombre());
            i++;
        }
        
        int opcion = entrada.nextInt();
        return opcion;
    }
    
       public void mostrarCitas(ArrayList<Cita> citas)
    {
        
        for(Cita item: citas)
        {
            item.InfoCita();
            
        }
        
    }
       public int CancelCitas(ArrayList<Cita> citas)
    {
        System.out.println("Seleccione la cita a cancelar");
        int i=1;
        for(Cita item:citas)
        {
            System.out.println(i+"."+item.getFechaCita());
            i++;
        }
        
        int opcion = entrada.nextInt();
        return opcion;
    }
}
