package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* FOR
        Sintaxis:   for (contador= 0; contador < repeticiones; contador++){
                        // El código que se repite
                    }

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++){

            if (i%2 == 0){
                continue;  // se salta al siguiente ciclo
            }

            System.out.println(num +" X "+ i +" = "+ (num*i));

            if(i > 6){
                break;  //lo usamos para salir del ciclo aunque no se halla terminado de cumplir la condition
            }
        }
     /*
        WHILE
        Sintaxis: while (condition){
            código a repetir
        }

        Se ocupa cuando es indefinido el numero de repeticiones, si es definido entonces mejor for.


	 Scanner sc = new Scanner(System.in);
     System.out.println("Adivina el numero secreto");
     int num = sc.nextInt();
     int numeroSecreto = 33;

     while (num != numeroSecreto){
         System.out.println("Error, intenta de nuevo. Adivina el numero secreto");
         num = sc.nextInt();
     }

     sc.close();

     System.out.println("Felicidades ese era.");
        /*
        DO WHILE
        Sintaxis: do{
            código a repetir
        }while (condition);

        lo mismo que while pero se ejecuta si o si al menos una vez

        */
        Scanner sc = new Scanner(System.in);
        int num;
        int numeroSecreto = 33;

        do{
            System.out.println("Adivina el numero secreto");
            num = sc.nextInt();
        }while (num != numeroSecreto);

        sc.close();

        System.out.println("Felicidades ese era.");

    }
}
