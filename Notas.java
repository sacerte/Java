/*
Programa para calcular el promedio de 10 notas, sacar las notas mayores al 
promedio, las notas menores al promedio, la suma de las notas y la nota mayor
y menor de todas las notas

Yaser Yamil Meshir Vargas
 */
package remington;
import java.util.Scanner;

public class Notas {
    public static void main (String arg[]){
        //Declaracion de Variables
        float sumatot=0, promedio=0, num=0, mayores, menores;
        float nmay=0, nmen=1000, notas []=new float[10];
        int i;        
        //cliclo para la captura de los datos
        for (i=0;i<=9;i++){
            Scanner teclado=new Scanner(System.in);
            System.out.print("Digite nota: ");
            notas[i]= teclado.nextFloat();
            }//cierre del for
        //ciclo para la suma de las notas y el cálculod el promedio
        for (i=0;i<=9;i++){
            sumatot = sumatot+notas[i];
            promedio=sumatot/10;
        }//cierre del for
        //ciclo para el calculo de la nota mayor
        for (i=0;i<=9;i++){
            if(notas[i]>nmay)
                nmay = notas[i];
        }//cierre del for
        //ciclo para el calculo de la nota menor
        for (i=0;i<=9;i++){
            if (notas[i]<nmen)
                nmen=notas[i];           
        }//cierre del for
        //impresion en pantalla de la informacion solicitada
        System.out.println("El promedio total es: '"+promedio+"'");
        System.out.println("La suma total es: '"+sumatot+"'");
        System.out.println("La nota mayor es: '"+nmay+"'");
        System.out.println("La nota menor es: '" +nmen+"'");
        System.out.print("Las notas mayores al promedio son: ");
        //ciclo para el calculo de las notas mayores y menores al promedio
        for (i=0;i<=9;i++){
            if (notas[i]>promedio){
                mayores=notas[i];
                System.out.print("'"+mayores+"' ");                    
            }//cierre del if
        }//cierre del for
        System.out.println("");
        System.out.print("Las notas menores al promedio son: ");
        for (i=0;i<=9;i++){
            if(notas[i]<promedio){
                menores=notas[i];
                System.out.print("'"+menores+"' ");                                                   
            }//cierre del if
        }//cierre del for   
        System.out.println("");
    }//cierre del main
}//Cierre de la clase Notas
