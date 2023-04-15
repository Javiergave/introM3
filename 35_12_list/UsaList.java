
/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest programa comprova la funcionalitat de List.java

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class UsaList {

    public static void main(String[] args) {

        List<String> llista;


        // TODO: inicialitza la llista amb una instància de  ArrayList
        List<String> arrList = new ArrayList<String>();

        //       o un LinkedList. Com et vingui de gust



        System.out.println("Obtenim les entrades");

        System.out.println("====================");

        String valor;


        valor = Entrada.readLine();


        // TODO: afegeix valor a la llista
        arrList.add(valor);


        valor = Entrada.readLine();


        // TODO: afegeix el valor a l'inici de la llista
        arrList.add(0,valor);



        valor = Entrada.readLine();


        // TODO: afegeix el valor al mig de la llista
        arrList.add((arrList.size()/2),valor);



        System.out.println("Cerquem elements de la llista");

        System.out.println("=============================");

        String text = Entrada.readLine();


        boolean esTroba = false;

        // TODO: inicialitza esTroba a true si text està a la llista
        for(int i = 0; i<arrList.size();i++){
            if(arrList.get(i).equals(text)){
                esTroba=true;
                break;
            }
        }


        System.out.printf("El text %s és troba a la llista: %s%n", text, esTroba);


        int indexPrimerOcurrencia=-1;

        // TODO: inicialitza indexPrimerOcurrencia a l'índex on es troba text
        for(int i = 0; i<arrList.size();i++){
            if(arrList.get(i).equals(text)){
                indexPrimerOcurrencia=i;
                break;
            }
        }

        System.out.printf("Posició de %s a la llista: %s%n", text, indexPrimerOcurrencia);



        System.out.println("Mostrem les entrades introduïdes");

        System.out.println("================================");

        boolean llistaBuida=false;

        // TODO inicialitza llistaBuida de manera que valgui cert si

        // la llista està buida.
        if(arrList.isEmpty()){
            llistaBuida=true;
        }

        while (! llistaBuida) {

            String entrada;

            // TODO: inicialitza entrada de manera que contingui el

            // primer element de la llista
            entrada=arrList.get(0);

            System.out.println(entrada);

            // TODO: elimina el primer element de la llista
            arrList.remove(0);

            // TODO: actualitza el valor de llistaBuida
            if(arrList.isEmpty()){
                llistaBuida=true;
            }

        }

    }

}