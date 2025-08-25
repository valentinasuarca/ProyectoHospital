/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
import Vista.*;
import java.util.ArrayList;

public class MenuPrincipalControlador {
  Medico medico;
    MenuMedico1 menuMedico1 = new MenuMedico1();
    ArrayList<Medico> medicos = new ArrayList <>();  
    
    Paciente paciente;
    MenuPaciente1 menuPaciente1 = new MenuPaciente1();
    ArrayList<Paciente> pacientes = new ArrayList <>();
    Cita cita;
    MenuCita menuCita = new MenuCita();
    CitasControlador citasControlador;
    public void analizaSeleccion (int opcion)
    {
        switch (opcion)
        {
            case 1: 
                medico= menuMedico1.displayMenu();
                medicos.add(medico);
                break;
                
            case 2:
                paciente = menuPaciente1.displayMenu();
                pacientes.add(paciente);
                break;
            case 3:
                cita=new Cita(paciente,medico);
                citasControlador = new CitasControlador(menuCita, cita);
                citasControlador.displayMenuController(medicos, pacientes);
                break;

            default:
                break;
        }
    }   
      
}
