package Televisao;

public class Televisor {
    public int volume;
    public int canal;

    public void aumentarVolume(){
        volume++;
    }

    public void baixarVolume(){
        volume--;
    }

    public void trocarCanal(int novoCanal){
        canal = novoCanal;
    }
}
