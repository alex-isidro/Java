package fiap.com.br.bean;

public class ContaPoupanca extends ContaBancaria{
//    atributos
    private int diaDeRendimento;


    //contrutores


    public ContaPoupanca() {
    }

    public ContaPoupanca(String cliente, int numConta, float saldo, int diaDeRendimento) {
        super(cliente, numConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    //getter/setter
    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }
    //metodos
    public float novoSaldo(float rendimento) {
        float novoSaldo = super.getSaldo() * (1 + rendimento / 100);
        super.setSaldo(novoSaldo);
        return super.getSaldo();
    }
}
