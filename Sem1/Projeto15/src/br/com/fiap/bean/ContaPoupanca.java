package br.com.fiap.bean;

/**
*Classe para criar objetos do tpo ContaPoupanca
* @author fulano da Silva
* @version 1.0
* @since 21.0.7
 */
public class ContaPoupanca implements ContaBancaria{
    //atribtos
    private int numConta;
    private float saldo;


    //construtores
    public ContaPoupanca(){}

    //metodos getter /setter

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    //metodos da classe

    /**
     * metodo sacar quer permitir sacar um valor informado
     * valor informado n"ao deve ser superior ao saldo atual
     * @author fulano da Silva
     * @param valor indica valor a ser sacado
     * @return float - valor do saldo(atualizado)
     */
    public float secar(float valor){
        try {
            if (valor <= saldo){
                saldo-=valor;
            }else{
                throw new Exception("Saldo Insuficiente");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return saldo;
    };

    /**
     * metodo depositar que permite depositar um valor informado
     * @author Ciclano de souza
     * @param valor indica valor a ser depositado
     * @return flat - valor do saldo (atualizado)
     */

    public float depoitar (float valor){
        saldo +=valor;
        return saldo;
    };
}
