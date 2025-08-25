/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author mateo
 */
import java.util.Scanner;

public class MenuPrincipal {
    public int displayMenu()
    {
        Scanner entrada = new Scanner(System.in);
        int opcion=0;
        System.out.println("Dijite la opcion deseada");
        System.out.println(" 1. Medico");
        System.out.println(" 2. Paciente");
        System.out.println(" 3. Cita");
        System.out.println(" 4. Salir");
        System.out.print(" >>");
        opcion = entrada.nextInt();
        return opcion;
    }
}
