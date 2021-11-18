/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import igu.Pantalla;
import logica.Controladora;


/**
 *
 * @author SIERRA
 */
public class Sinches_HugoIvan_tpo2 {

       public static void main(String[] args) {
    
        
        // Instancia de la Controladora para inicializar la persistencia
        Controladora control = new Controladora();

        // Inicializo la igu pasandole la instancia como argumento
        Pantalla panta = new Pantalla(control); // Conexion de la igu con la logica

        panta.setVisible(true); // La hace visible 
        panta.setLocationRelativeTo(null); // La centra en la pantalla
        panta.setResizable(false); // Hace que mantenga su tamaño

    }

}
