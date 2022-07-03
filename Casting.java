package br.com.variaveis;

import java.util.Scanner;

/**
 * @author marcelo
 */

public class Casting {
    /*
    Tarefa: Ler um valor númerico do console e colocar numa variavél do tipo primitiva,
    faça a conversão para o tipo wrapper da variável e imprima no console.
     */

    public static void main(String args[]){

        // creates an object of Scanner
        Scanner input = new Scanner(System.in);
        int num;

        System.out.printf("Informe um número inteiro: ");
        num = input.nextInt();

        Integer numWrapper = num;
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("O valor informado foi: " + numWrapper);


    }



}
