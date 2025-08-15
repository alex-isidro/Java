package br.com.fiap.main;

public class TesteVetores {
    public static void main(String[] args) {
        String[] carros= {"Volvo", "BMW","Ford","Manzda"}; //Array
        System.out.println(carros.length);

        int[] numeros = new int[3];//quando instancia ele so pode armazenar valores informados
        numeros[0] = 17;
        numeros[1] = 48;
        numeros[2] = 78;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("");

        for (int i : numeros ) { // so funciona no vetor
            System.out.println(i);
        }
    }
}
