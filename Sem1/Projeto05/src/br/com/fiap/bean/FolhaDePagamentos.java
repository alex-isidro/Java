package br.com.fiap.bean;

public class FolhaDePagamentos {

        public double salarioBruto;
        public int numeroDeDepentes;
        public double descontoINSS;
        public double valorPlanoDeSaude;

        public double CalcularSalarioLiquido(){
            return (salarioBruto-descontoINSS) - (valorPlanoDeSaude * numeroDeDepentes);
        }


}
