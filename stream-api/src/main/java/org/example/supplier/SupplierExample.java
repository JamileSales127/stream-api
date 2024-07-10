package org.example.supplier;

import java.util.List;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExample {

  public static void main(String[] args) {

    List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
        .limit(5)
        .toList();

    listaSaudacoes.forEach(System.out::println);
  }
}
