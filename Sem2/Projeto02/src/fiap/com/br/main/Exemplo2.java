package fiap.com.br.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo2 {
    public static void main(String[] args) {
        ArrayList<String> carros =  new ArrayList<>(
                Arrays.asList("Volvo", "bwm", "ford","Mazda")
        );
        System.out.println(carros);
        carros.set(1,"Volkswagen");// troca no local escolhido
        System.out.println(carros);
        carros.remove(2); // remove
        System.out.println(carros);
        carros.clear();//apaga tudo
        System.out.println(carros);

    }
}
