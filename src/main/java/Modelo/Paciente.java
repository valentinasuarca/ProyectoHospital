/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
/**
 *
 * @author mateo
 */
public class Paciente {
    private String nombre;
    private int edad;
    private String genero;
    protected HistorialMedico historialMedico;
    private int id;
    private ArrayList<HistorialMedico> HistorialesMedicos = new ArrayList<HistorialMedico>();
    public Paciente (String nombre,int edad, String genero,HistorialMedico historialMedico, int id)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.historialMedico = historialMedico;
        this.id = id;
    }
    
    public String getNombre ()
    {
        return nombre;
    } 
    
    public int getEdad ()
    {
        return edad;
    } 
    
    public String getGenero ()
    {
        return genero;
    } 
    
    public HistorialMedico getHistorialMedico (String tratamientos,String diagnostico,String alergias)
    {
        return historialMedico;
    } 
    
    public int getId ()
    {
        return id;
    } 
    void MostrarInformacionPaciente()
    {
        System.out.println("nombre del paciente: " + nombre);
        System.out.println("edad del paciente: " + edad);
        System.out.println("genero del paciente: " + genero);
      
        historialMedico.MostrarHistorial();
      
    }
}
