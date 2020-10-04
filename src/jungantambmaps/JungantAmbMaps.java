package jungantambmaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author bernat
 */
public class JungantAmbMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<Integer, String> persones = new HashMap<>();
        persones.put(2, "Paco");
        persones.put(5, "Maria");
        persones.put(10, "Joan");        
        
        System.out.println(">la clau 2 conté:"+persones.get(2));
        System.out.println(">la clau 20 conté:"+persones.get(20));
        System.out.println(">conté la clau 20?"+persones.containsKey(20));
        
        persones.put(2, "Substitut");
        
        System.out.println(">la clau 2 conté:"+persones.get(2));

        for( String p: persones.values()){ // foreach
            System.out.println(">"+ p);
        }
        System.out.println("===========================================");
        for( Integer k: persones.keySet()){ // foreach
            System.out.println(">"+ k);
        }
        
        
        //=================================================================================
        // Recompte de freqüències d'una taula de cadenes
        String[] frase ={"Hola", "bon",  "dia", "fa", "bon",  "dia" , "avui", "Hola"};
        // Sortida desitjada
        // > Hola: 2
        // > bon: 2
        // > dia: 2
        // > fa: 1
        // > avui: 1
        Map<String, Integer> mapa = new HashMap<>();
        for(String paraula:frase) {
            paraula = paraula.toUpperCase();
            int recompte = 0;
            if(mapa.containsKey(paraula)) {
               recompte = mapa.get(paraula);
            }
            recompte++;
            mapa.put(paraula, recompte);
        }
        
        //---------------------------------------------------------------------------------
        // Ampliació: la sortida hauria de mostrar-se en ordre alfabètic.
        // > avui: 1                
        // > bon: 2        
        // > dia: 2
        // > fa: 1
        // > Hola: 2
        Set<String> paraules =  mapa.keySet();
        //-------------
        ArrayList<String> llistaParaulesOrdenada = new ArrayList<>();
        for(String p:mapa.keySet()){
            llistaParaulesOrdenada.add(p);
        }
        //-------------
        Collections.sort(llistaParaulesOrdenada);
        for(String paraula:llistaParaulesOrdenada) 
        {
            System.out.println(">"+paraula + ": occurrències ->"+ mapa.get(paraula) );
        }
        //-------------
        ArrayList<Persona> llistaObjectesPersona = new ArrayList<>();
        Persona paco = new Persona(3,"Paco");
        Persona maria = new Persona(2,"Maria");
        llistaObjectesPersona.add(paco);
        llistaObjectesPersona.add(maria);
        Collections.sort(llistaObjectesPersona); // ordre natural
        for(Persona p:llistaObjectesPersona) {
            System.out.println(">" + p );
        }
        //--------------------------------------------------------------------
        // ara vull ordenar usant ordre per noms
        Comparator<Persona> comparador = new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getNom().compareTo(o1.getNom());
            }
        };
        
        Collections.sort(llistaObjectesPersona,comparador);
        for(Persona p:llistaObjectesPersona) {
            System.out.println(">" + p );
        }

        //
        System.out.println("He fet un canvi DES DEL PRINCIPAL");
        
        // Canvi a la còpia
        System.out.println("Sóc còpia");
        
        
    }
    
}

