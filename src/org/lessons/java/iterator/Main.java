package org.lessons.java.iterator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inizializzo la mia classe ciclabile");
        int[] arrayInteri = {55, 66, 77, 88, 99, 0, 1, 3, 55, 1, 2, 34, 44, 3, 52, 3};
        
        Ciclabile iteratore = new Ciclabile();

        System.out.println(Arrays.toString(arrayInteri));

        System.out.println(iteratore.getIndiceCorrente());

        try  {
            System.out.println(iteratore.getElementoSuccessivo());
        } catch (Exception eccezione){
            System.out.println("Problemuzzo: " + eccezione.getMessage());
        }

        System.out.println(Arrays.toString(iteratore.getInteri()));

        iteratore.addElemento(44);
        iteratore.addElemento(33);
        iteratore.addElemento(66);
        iteratore.addElemento(22);

        iteratore.addElementoInTesta(1572);
        System.out.println(Arrays.toString(iteratore.getInteri()));


        while (iteratore.hasAncoraElementi()){
            try {
                System.out.println("Elemento al posto: " + (iteratore.getIndiceCorrente() + 1) + ", con valore: " + iteratore.getElementoSuccessivo());
            } catch (Exception eccezione){
                System.out.println(eccezione.getMessage());
            } finally { // ^ IN OGNI CASO esegui questo blocco
                System.out.println("fine esecuzione");
            }
        }

    
    }
}
