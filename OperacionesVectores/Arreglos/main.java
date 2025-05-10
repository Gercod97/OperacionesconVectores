package Arreglos;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int[] numerosEnteros = new int[3];

        Scanner scan = new Scanner(System.in); 

        for (int i = 0; i <numerosEnteros.length; i++) {
            int numeroLimite;
            do {

                System.out.println("Numero "+ (i+1)+ " : ");
                numeroLimite = scan.nextInt();
                

                if (numeroLimite <10 || numeroLimite>100 ) {
                System.out.println("El valor debe estar entre 10 y 100, por favor intentelo nuevamente");
                }
            }
            while (numeroLimite <10 || numeroLimite>100 ); 
                    numerosEnteros[i]=numeroLimite;

                    
        } 
        for (int num:numerosEnteros) {
            System.out.println("Los valores que registró fueron: " + (num));

        }

        boolean encontrado=false;

        
            
            System.out.println("Ingrese un número a buscar dentro del vector: ");
            int valorBuscado = scan.nextInt();

            for ( int i=0; i<numerosEnteros.length; i++){
                if (numerosEnteros[i]==valorBuscado) {
                    System.out.println("El numero ingresado está en la posición: "+ (i+1));
                    encontrado=true;
                    break;

                    
                
                }           
            
        }

            if  (!encontrado) {
                System.out.println("El número ingresado no se encuentra dentro del vector");

            }


            int valorMayor=numerosEnteros[0];
            for (int i=0; i<numerosEnteros.length; i++) {
                
                if (numerosEnteros[i]>valorMayor) {
                valorMayor=numerosEnteros[i];

                    
                    
                }


            }
            System.out.println("El valor más alto dentro del vector es: "+ valorMayor);

            int valorMenor=numerosEnteros[0];
            for (int i=0; i<numerosEnteros.length; i++) {
                
                if (numerosEnteros[i]<valorMenor) {
                valorMenor=numerosEnteros[i];

                    
                    
                }


            }
            System.out.println("El valor más bajo dentro del vector es: "+ valorMenor);


            int sumaVector=0;

            for (int valor: numerosEnteros) {
                sumaVector+=valor;

                
            }
            System.out.println("La suma de los valores del vector es: " +sumaVector);

            System.out.println("Ingrese un número entero: ");
            int x = scan.nextInt();

            boolean  encontrar=false;

            for(int numero:numerosEnteros) {
                if (numero%x==0) {
                    System.out.println("El numero " + numero + " es multiplo de " + x);
                    encontrar=true;
                    }

                }

            if (!encontrar) {
                
                System.out.println("No se encontró ningún múltiplo de " + x + " dentro del vector");
                
                }
            


        scan.close();


    



    }
}
