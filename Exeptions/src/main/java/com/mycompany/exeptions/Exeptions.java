/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exeptions;

/**
 *
 * @author SCIS2-13
 */
public class Exeptions {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        try {      //Try ejecuta el proceso sin crashear sin importar si el codigo esta mal
            int res = calculator.division(4, 0);

            System.out.println(res);
        } catch (Exception exeption) {  //Catch hace que despues del proceso anterior almacene el error dentro de la variable Exception
            System.out.println("A ocurrido un problema");
            System.out.println(exeption);
        } finally {        //Finally ejecuta lo que tenga adentro despues de los dos procesos anteriores, sin importar si hubo error o no
            System.out.println("Proceso terminado");
        }
        
        
        try{
        int[] numbers = new int[3];
        numbers[5] = 2/0;
        }
    }

}
