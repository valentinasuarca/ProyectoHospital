/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
/*import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class GestorCitas extends Cita{
    
    GestorCitas(Paciente paciente,Medico medico,String fechaCita, String horaCita,String comentario)
    {
        super(paciente,medico,fechaCita,horaCita,comentario);
    }
    

    private ArrayList<Cita> citas = new ArrayList<Cita>();
    private ArrayList<Cita> citasMedicos = new ArrayList<Cita>();
    private ArrayList<Cita> citasPacientes = new ArrayList<Cita>();
    
    public void AgregarCita(Cita cita)
    {
        citas.add(cita);
    }
    
    public void CancelaCita (Cita cita)
    {
        citas.remove(cita);
    }
    
    public void Asignacion()
    {
        for(Cita item:citas)
        {
            if(item.getMedico().equals(medico))
            {
            citasMedicos.add(item);
            }
            else if(item.getPaciente().equals(paciente))
            {
            citasPacientes.add(item);
            }
        
        }
        
    }
     public ArrayList<Cita> getCitasMedico(Medico medico) 
    {
        ArrayList<Cita> citasMedico = new ArrayList<>();
        for (Cita cita : citas) 
        {
            if (cita.getMedico().equals(medico)) 
            {
                citasMedico.add(cita);
            }
        }
        return citasMedico;
    }

    public ArrayList<Cita> getCitasPaciente(Paciente paciente) 
    {
        ArrayList<Cita> citasPaciente = new ArrayList<>();
        for (Cita cita : citas) 
       {
            if (cita.getPaciente().equals(paciente)) 
            {
            citasPaciente.add(cita);
            }
        }
        return citasPaciente;
   }
    
    
    
}
*/