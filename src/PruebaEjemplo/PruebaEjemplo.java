/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaEjemplo;

import PruebaEjemplo.CuentaHabiente;

/**
 *
 * @author vania
 */
public class PruebaEjemplo {
    
    private static String balance;
    
    public static void main(String[] args){
            /*Se debe crear un arreglo de 5 cuentahabientes con datos de ejemplo
              y con un FOR EACH deben mostrar quien es Premium y quien es Regular*/
        System.out.println("Cuenta Habiente");
        CuentaHabiente[] lista new = CuentaHabiente[5];
        lista[0] = new CuentaHabiente(77777, Jesus, 70000);
        lista[1] = new CuentaHabiente(99999, Roman, 50000);
        lista[2] = new CuentaHabiente(22222, Camilo, 20000);
        lista[3] = new CuentaHabiente(33333, Bruno, 90000);
        lista[4] = new CuentaHabiente(66666, Antonio, 100000);
        
        for (int i = 0; i < lista.length; i++) {
            CuentaHabiente cuentahabiente = lista[i];
            System.out.println(cuentahabiente.evaluarNivelCliente());
            
        }
        
                
}



}
