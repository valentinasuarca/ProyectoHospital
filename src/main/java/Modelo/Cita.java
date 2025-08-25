/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.time.*;
import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class Cita {
    protected Paciente paciente;
    protected Medico medico;
    protected LocalDate fechaCita;
    protected LocalTime horaCita;
    protected String comentario;
    
    public Cita (Paciente paciente,Medico medico )
    {
        this.paciente = paciente;
        this.medico = medico;
     
    }
    
    public void setFechaCita (LocalDate fechaCita)
    {
        this.fechaCita = fechaCita;
    }
    
    public void setHoraCita (LocalTime horaCita)
    {
        this.horaCita = horaCita;
    }
    
    public void setComentario (String comentario)
    {
        this.comentario = comentario;
    }
   
    public Paciente getPaciente ()
    {
        return paciente;
    }        
    
    public Medico getMedico ()
    {
        return medico;
    }   
    
    public LocalDate getFechaCita ()
    {
        return fechaCita;
    }   
    
    public LocalTime getHoraCita ()
    {
        return horaCita;
    }      
    
    public String getComentario ()
    {
        return comentario;
    } 
   
    
    
    private ArrayList<Medico> medicos = new ArrayList<Medico>();
    public void AgregarMedico(Medico medico)
    {
        medicos.add(medico);
    }
    
    private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    public void AgregarPaciente(Paciente paciente)
    {
        pacientes.add(paciente);
    }
     
    public void InfoCita()
    {
        System.out.println("************");
        System.out.println("INFORMACION DE LA CITA");
        System.out.println("Informacion del medico");
        System.out.println("Nombre del medico: " + medico.getNombre());
        System.out.println("Especialidad: " + medico.getEspecialidad());
        System.out.println("Id del medico: " + medico.getnumeroid());
        System.out.println("Horario del medico: " + medico.getInicio()+ " a " + medico.getFinalizacion());
        for(Paciente item: pacientes)
        {
            item.MostrarInformacionPaciente();
                    
        }
        System.out.println("fecha de la cita: " + fechaCita);
        System.out.println("hora de la cita: " + horaCita);
        System.out.println("comentarios: " + comentario);
        
        
        
    }
    
}
