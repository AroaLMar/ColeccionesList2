package com.company;

import java.util.*;

public class CollectionList1{
    public static void main(String args[]){
        LinkedList<String> personas=new LinkedList<String>();

        //Añadir elementos
        personas.add("Carlos");
        personas.add("Juan");

        //Añadir elemento en la primera posicion
        personas.addFirst("Maria");

        //Añadir elemento en la ultima posicion
        personas.addLast("Sandra");

        //Añadir un elemento en la 31 posicion
        personas.add(2, "Ana");

        //Iterador
        Iterator<String> iterator=personas.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
