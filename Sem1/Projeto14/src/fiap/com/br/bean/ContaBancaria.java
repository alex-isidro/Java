package fiap.com.br.bean;

import javax.swing.*;

public class ContaBancaria {
    //atributos
    private String cliente;
    private int numConta;
    private float saldo;


    //contruytor


    public ContaBancaria() {
    }

    public ContaBancaria(String cliente, int numConta, float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    //getter e setter
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

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

    //metodos
    public float sacar(float valor){
        if (valor <= saldo){
            saldo -=valor;
        }else {
            JOptionPane.showMessageDialog(null, "Valor superior ao seu saldo atual");
        }
        return saldo;
    }

    public float depositar(float valor){
        return saldo += valor;
    }
}
