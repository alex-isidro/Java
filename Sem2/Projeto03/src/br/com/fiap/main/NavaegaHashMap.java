package br.com.fiap.main;

import java.util.HashMap;
import java.util.Map;

public class NavaegaHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> herois = new HashMap<>();

        herois.put("Superman", 18);
        herois.put("Batman", 25);
        herois.put("Mulher-Maravilha", 18);

        // pegas a chave
        herois.keySet().forEach(System.out::println);

        // pega os valores
        herois.values().forEach(System.out::println);

        // primeira forma
        herois.forEach((heroi, idade) -> System.out.println(heroi + " => " + idade));

        //segunda forma
        System.out.println(herois);
        for(Map.Entry<String, Integer>i : herois.entrySet()) {
            System.out.println("Chave:" + i.getKey() + "\nValor:" + i.getValue());
        }
    }
}
