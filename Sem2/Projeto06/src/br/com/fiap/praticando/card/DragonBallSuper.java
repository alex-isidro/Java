package br.com.fiap.praticando.card;

import java.io.*;

public class DragonBallSuper implements IDBSuper {

    private String nome, codigoP;
    private int ki,tecnicas,velocidade,trasformacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(int tecnicas) {
        this.tecnicas = tecnicas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getTrasformacao() {
        return trasformacao;
    }

    public void setTrasformacao(int trasformacao) {
        this.trasformacao = trasformacao;
    }

    @Override
    public DragonBallSuper ler(String path) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(path + "/" + codigoP + ".txt"));
        codigoP = br.readLine();
        nome = br.readLine();
        ki = br.read();
        tecnicas = br.read();
        velocidade = br.read();
        trasformacao = br.read();
        br.close();
        return this;
    }

    @Override
    public String gravar(String path) {
        try {
            File dir = new File(path);
            if (!dir.exists()) {
                dir.mkdir();
            }
            PrintWriter pw = new PrintWriter(path + "/" + codigoP + ".txt");
            pw.println(nome);
            pw.println(ki);
            pw.println(tecnicas);
            pw.println(velocidade);
            pw.println(trasformacao);

            pw.flush();
            pw.close();
            return "Arquivo gravado com sucesso";
        } catch (IOException e) {
            return "Falha ao gravar arquivo: " + e.getMessage();
        }
    }
}
