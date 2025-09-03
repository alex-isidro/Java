package br.com.fiap.bean;

public class Triangulo extends Quadrado{
    //atributos
    private float altura;
//    contrutores
    public Triangulo(){}

    public Triangulo(float lado, float altura) {
        super(lado);
        this.altura = altura;
    }

    //metodos getter/setter

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    //metodos da classe(particulares)

    public float calcularArea() {
        return super.getLado()*altura/2;
    }
}
