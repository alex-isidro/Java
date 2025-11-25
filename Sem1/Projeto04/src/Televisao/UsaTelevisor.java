package Televisao;

public class UsaTelevisor {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.canal= 9;
        televisor.volume= 8;
        televisor.trocarCanal(6);
        televisor.baixarVolume();
        System.out.println("Volume atual: "+ televisor.volume+"\nCanal atual: "+ televisor.canal);
    }
}
