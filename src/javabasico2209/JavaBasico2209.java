/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import javax.swing.JOptionPane;

/**
 *
 * @author vania
 */
public class JavaBasico2209 {

    private static String resultado;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 20;
        System.out.println("Edad = " + edad);
        Integer edad2 = new Integer(22);
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue() );
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.");
        //convertir Strings a entero
        String cadena= "99";
        int altura = Integer.parseInt(cadena); 
        altura += 1;
        System.out.println("Altura = " + altura);
        
        float y= Float.parseFloat(cadena);
        y=y + 0.5f;
        System.out.println("Altura = " + y );
        System.out.println("--------------------------");
        
        Arbol tree1 = new Arbol(2.4f, 15 );
                
        System.out.println(tree1);
        
        System.out.println("Troncos de un arbol = " + Arbol.tronco);
        Arbol.generarOxigeno();
                
        JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va el mensaje", JOptionPane.ERROR_MESSAGE);
        
        // ok
        //ok
        //Codigo sin operador ternario
        int edad3 = 20;
        //validar si es mayor de edad
        String resultado = "";
        if(edad < 18){
            resultado = "Menor de edad";
           
        }else{
            resultado = "Mayor de edad, ten un tequila para la garganta";
        }
        System.out.println(resultado);
        //aca, hare el mismo algoritmo pero con operador ternario
        // <cond>? <true> : <False>;
        
        int edad4=15;
        String res = "";
        res = edad < 18? "Menor de edad" : "Mayor de edad, tequila";
        System.out.println( res );
        
        //s
        //
        
        //version minima
        int edad5 = 15;
        
        System.out.println(edad5 < 18? "Menor de edad 5":"Ya! el tequila" );
        
        //siguiente
        int val1 = 1;
        int val2 = 2;
        //haremos una comparacion or a nivel de bits es dcer
        /*
        val1 = 0000....0001
        val2 = 0000...0010;
        Estan de acuerdo que las dos lineas de arriba es la
        representacion a nivel bits??
        Pregunta 1 or 0 ?? cuanto es?
        Entonces vean como funciona el or a nivel de bits
        */
        System.out.println( val1 | val2 );
        /*
        Que esta pasando`, esto:
         val1 = 0000...0001;
        or
         val2 = 0000...0011 => 3
        ----------------------
                0000...0011
        */
        int val3 = 1 ; // 0000...0001
        //int val4 << val3;
        //System.out.println( val3 <<= );
        int val4 = 0;
        val4 = val3 << 2;
        System.out.println( val4 );
        
        System.out.println("------------------ARREGLOS----------------------");
        int[] edades ;
        edades = new int [5];
        System.out.println(edades);
        
        edades [0] = 10 ;
        System.out.println("Laprimer edad es:" + edades [0]);
        
        //declarar e inicializar en una sola linea
        
        int[] estaturas = new int [5];
        //ahora.. al igual que en c y c++, puedes asignar valores     
        int[] pesos = {86,99,56,76,77}; //kilos
        // este ultimo veremos su contenido
        System.out.println(pesos [0]);//86
        System.out.println(pesos [1]);//99
        System.out.println(pesos [2]);//56
        System.out.println(pesos [3]);//76
        System.out.println(pesos [4]);//77
        //Imprimire lo mismo pero con menos linea de codigo
        System.out.println("------CON FOR--------");
        for (int i = 0; i < pesos.length; i++){
            System.out.println(pesos[i] );
        }
        
        System.out.println("Arreglo de alumno");
        Alumno[] lista = new Alumno[5]; // 5 alumnos
        lista[0] = new Alumno("99999", 2, 9.0f);
        lista[1] = new Alumno("77777", 2, 7.0f);
        lista[2] = new Alumno("55555", 2, 7.0f);
        lista[3] = new Alumno("88888", 2, 8.0f);
        lista[4] = new Alumno("66666", 2, 6.0f);
        
        for (int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempenio() );
            
        }
        
        /*For each es un FOR especial, introducido
        en la version 2 de java, esa version fue la que
        sufrio cambios grandes java
        EL FOR EACH fue introducido para simplificar los FOR con arreglos.
        hagan esto
        fore + TAB
        */
        System.out.println("Con for each ... ");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempenio());            
        }
    }
    
}
