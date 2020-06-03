/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Mirian Marcio Diogo
 */
public class Revisao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);

       DecimalFormat f = new DecimalFormat ("0.00");
        
       double anelInd, anelAlim2X, custoTotal;
       anelInd = 4.00;
       anelAlim2X = 7.00;
       
       System.out.println("Digite o numero de frangos na granja: ");
       int quantFrangos = scan.nextInt();
       
       custoTotal = quantFrangos * (anelInd + anelAlim2X);
        System.out.println("O total a pagar e: " + custoTotal);
    }
    
}
