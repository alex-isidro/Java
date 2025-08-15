package controle;

public class Controle {
    public String onOff;
    public int canal;
    public int volume;

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void trocarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void trocarOnOff(String novoOnOff){
        onOff = novoOnOff;
    }
}
