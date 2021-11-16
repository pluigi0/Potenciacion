
package Potenciacion;

import java.util.Scanner;

public class PotenciaNumeros {
    public static void main (String [] args){
        double resultado, base, exponente;
        
        Scanner datos = new Scanner (System.in);
        
        System.out.println(" PROGRAMITA PA CALCULAR la POTENCIACION de numero elevado a cierto exponente ");
        
        System.out.println(" dame un numero que sirve como BASE: ");
        base = datos.nextDouble();
        
        System.out.println(" dame un numero que sirva como EXPONENTE: ");
        exponente = datos.nextDouble();
        
        resultado = Math.pow(base, exponente);
        
        System.out.print(" La base es "+base+ " El exponente es "+exponente+" el resultado es: "+resultado);
        
    }
}
