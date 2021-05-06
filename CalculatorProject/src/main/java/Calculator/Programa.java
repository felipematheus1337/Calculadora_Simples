/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Programa extends KernelCalculatorr {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        //Declaração das variáveis auxiliares.
        int op;
        double n1,n2;
        String cd;
        //Inicialização do Programa.
      
        System.out.println("\nBem vindo a Calculadora Simples!");
        
        //Incrementação dos valores a serem utilizados
        
        
        System.out.println("\nEscolha um primeiro valor :  ");
        n1 = input.nextDouble();
        System.out.println("\nEscolha um Segundo valor : ");
        n2 = input.nextDouble();
        //ESTRUTURA DE REPETIÇÃO E METODOS PASSADOS POR HERANÇA
        do {
        System.out.println("\nDigite a operação a ser realizada 1-Soma,2-Subtracao,3-Multiplicacao,4-Divisao,5-Sair");
        op = input.nextInt();
        
        switch(op) {
            case 1:
            System.out.println("\nResultado da Soma : "+ Adicao(n1,n2));
            System.out.println("\n Deseja continuar com os mesmos numeros? y=sim, n=nao : " );
            cd = input.nextLine();
            cd = input.nextLine();  
            if(cd.equals("y")) {
                n1 = n1+0;
                n2 = n2+0;
                break;
            }
            else{
                System.out.println("\nEscolha um primeiro valor :  ");
        n1 = input.nextDouble();
        System.out.println("\nEscolha um Segundo valor : ");
        n2 = input.nextDouble();
        break;
            }
            
            
            
            case 2:
            System.out.println("\nResultado da Subtracao : "+ Subtracao(n1,n2));
            System.out.println("\n Deseja continuar com os mesmos numeros? y=sim, n=nao : " );
            cd = input.nextLine();
            cd = input.nextLine();  
            if(cd.equals("y")) {
                n1 = n1+0;
                n2 = n2+0;
                break;
            }
            else{
                System.out.println("\nEscolha um primeiro valor :  ");
        n1 = input.nextDouble();
        System.out.println("\nEscolha um Segundo valor : ");
        n2 = input.nextDouble();
        break;
            }
            
            
            
            case 3:
            System.out.println("\nResultado da Multiplicacao : "+ Multiplicacao(n1,n2));
            System.out.println("\n Deseja continuar com os mesmos numeros? y=sim, n=nao : " );
            cd = input.nextLine();
            cd = input.nextLine();  
            if(cd.equals("y")) {
                n1 = n1+0;
                n2 = n2+0;
                break;
            }
            else{
                System.out.println("\nEscolha um primeiro valor :  ");
        n1 = input.nextDouble();
        System.out.println("\nEscolha um Segundo valor : ");
        n2 = input.nextDouble();
        break;
            }
            
            
            
            case 4:
            System.out.println("\nResultado da Divisao : "+ Divisao(n1,n2));
            System.out.println("\n Deseja continuar com os mesmos numeros? y=sim, n=nao : " );
            cd = input.nextLine();
            cd = input.nextLine();  
            if(cd.equals("y")) {
                n1 = n1+0;
                n2 = n2+0;
                break;
            }
            else{
                System.out.println("\nEscolha um primeiro valor :  ");
        n1 = input.nextDouble();
        System.out.println("\nEscolha um Segundo valor : ");
        n2 = input.nextDouble();
        break;
            }
                
            
            case 5:
                System.out.println("\nSaindo...");
                break;
                
            default:
        }
                
                
        } while(op!= 5);
            
            
      System.out.println("\nPrograma encerrado!!!! :)");
            
            
            
            
        }
        
        }

