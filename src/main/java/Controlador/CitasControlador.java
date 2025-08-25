/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Vista.*;
import Modelo.*;
import java.util.ArrayList;
/**
 *
 * @author mateo
 */
public class CitasControlador {
   private MenuCita menuCita;
   private Cita cita;
   private ArrayList<Cita> citas = new ArrayList<Cita>();
   static int id=1;
   
   CitasControlador(MenuCita menuCita, Cita cita)
   {
       this.cita=cita;
       this.menuCita=menuCita;
   }
   public void displayMenuController(ArrayList<Medico> medicos,ArrayList<Paciente> pacientes)
    {
      int opcion =0;
       while (opcion !=4)
        {
            opcion = menuCita.displayMenuCita();
      
        
        if(opcion==1)
        
        {
            crearCita(medicos, pacientes);
            menuCita.displayMenu(cita);
            citas.add(cita);
        }
        
        if(opcion==2)
        {
          cancelarCita(citas);
          menuCita.CancelCitas(citas);
        }  
        
        else if(opcion==3)
        {
          menuCita.mostrarCitas(citas);
          
        }
    
        }

    }
    public Cita crearCita(ArrayList<Medico> medicos,ArrayList<Paciente> pacientes)
    {
       int idMedico = menuCita.mostrarMedico(medicos);
       int idPaciente = menuCita.mostrarPacientes(pacientes);
       Medico medico = medicos.get(idMedico-1);
       Paciente paciente = pacientes.get(idPaciente-1);
       cita= new Cita(paciente, medico);
       cita.AgregarPaciente(paciente);
       cita.AgregarMedico(medico);
       
       return cita;
    }
    public void cancelarCita(ArrayList<Cita> citas)
    {
        citas.remove(cita);
        
    }        
    }
   



