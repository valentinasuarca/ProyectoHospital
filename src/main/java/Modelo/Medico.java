/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.time.*;
/**
 *
 * @author mateo
 */
public class Medico {
    private String nombre;
    private String especialidad;
    private int numeroid;
    private LocalTime inicio;
    private LocalTime finalizacion;
    
    public Medico (String nombre, String especialidad,int numeroid,LocalTime inicio, LocalTime finalizacion  )
    {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.numeroid = numeroid;
        this.inicio = inicio;
        this.finalizacion = finalizacion;
    }
    
    public String getNombre ()
    {
        return nombre;
    } 
    
    public String getEspecialidad ()
    {
        return especialidad;
    } 
    
    public int getnumeroid ()
    {
        return numeroid;
    } 
    
    public LocalTime getInicio()
    {
        return inicio;
    } 
    
    public LocalTime getFinalizacion ()
    {
        return finalizacion;
    } 
}
