package Arcondicionado;

public class ArConicionado {
    public int temperatura;
    public String modo;

    public void aumentarTemperatura(){
        temperatura++;
    }
    public void diminuirTemperatura(){
        temperatura--;
    }
    public void trocarModo(String novoModo){
        modo=novoModo;
    }
}
