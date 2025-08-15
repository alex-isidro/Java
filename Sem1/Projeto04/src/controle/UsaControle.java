package controle;

public class UsaControle {
    public static void main(String[] args) {
        Controle controle = new Controle();

        controle.volume = 4;
        controle.canal= 83;
        controle.onOff= "ON";
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.trocarCanal(9);
        controle.trocarOnOff("OFF");
        System.out.println("Situação: "+controle.onOff+"\nVolume atual: "+ controle.volume+"\nCanal atual: "+ controle.canal);
    }
}
