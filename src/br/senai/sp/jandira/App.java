package br.senai.sp.jandira;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        String [] frutas = {"uva" , "pera" , "maça" , "banana"};

        for (int i=0; i < frutas.length; i++){

            System.out.println("frutas" + (i+1) +" : " +  frutas[i]);
        }



        System.out.println("qual fruta deseja comprar: ");

        String opcaousuario = teclado.nextLine();

        for (int i=0; i < frutas.length; i++){

            boolean frutadisponivel = false;
            if (opcaousuario.equals(frutas[i])){
                System.out.println("bem vindo a quitanda do eliel temos essa fruta");
                frutadisponivel = true;
            }if (!frutadisponivel) {
                System.out.println("ainda nao temos essa fruta");
            }
        }

            // Exemplo while

         //    boolean teste = false;

        //    while ((!teste){
        //System.out.println("hojeeeee ja e quinta0");
        //     }


            //Exemplo do - while

             }


        }



