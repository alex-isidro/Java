package br.com.fiap;

public class radio {
    //atributos
    public int volume;
    public float estacao;
    //metodos
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void trocarEstacao(float frequancia){
        estacao = frequancia;
    }
}
