package br.com.fiap.praticando.card;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IDBSuper {
   DragonBallSuper ler(String path) throws FileNotFoundException, IOException;
   String gravar(String path);

}
