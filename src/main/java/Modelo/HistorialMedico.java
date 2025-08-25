/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mateo
 */
public class HistorialMedico {
    protected String diagnostico;
    protected String tratamientos;
    protected String alergias;
        
     public HistorialMedico(String diagnostico, String tratamientos, String alergias)
    {
        this.diagnostico = diagnostico;
        this.tratamientos = tratamientos;
        this.alergias = alergias;
    } 
     public void SetDiagnostico(String diagnostico)
    {
        this.diagnostico=diagnostico;
    }
      public void SetTratamientos(String tratamientos)
    {
        this.tratamientos=tratamientos;
    }
       public void SetAlergias(String alergias)
    {
        this.alergias=alergias;
    }
     
    public void MostrarHistorial()
    {
        System.out.println("Diagnostico: " + diagnostico);
        System.out.println("Tratamientos: " + tratamientos);
        System.out.println("Alergias: " + alergias);
    }
}
