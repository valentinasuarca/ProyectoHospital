/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplicacionhospital;
import Vista.*;
import Modelo.*;
import Controlador.*;
/**
 *
 * @author mateo
 */
public class AplicacionHospital {

    public static void main(String[] args) {
     MenuPrincipal menuPrincipal = new MenuPrincipal ();
        
        MenuPrincipalControlador controladorPrincipal = new MenuPrincipalControlador ();
        
        int opcion = 0;
        while (opcion !=4)
        {
            opcion = menuPrincipal.displayMenu();
            controladorPrincipal.analizaSeleccion(opcion);
            
        }
        
    }      
    }

