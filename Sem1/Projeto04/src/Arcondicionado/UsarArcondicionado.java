package Arcondicionado;

public class UsarArcondicionado {
    public static void main(String[] args) {
        ArConicionado arConicionado =  new ArConicionado();
        arConicionado.temperatura = 18;
        arConicionado.modo="ventilar";
        arConicionado.trocarModo("noturno");
        arConicionado.diminuirTemperatura();
        System.out.println("temperatura atual: "+ arConicionado.temperatura+"\nCanal atual: "+ arConicionado.modo);
    }
}
