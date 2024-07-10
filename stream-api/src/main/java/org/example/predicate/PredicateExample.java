package org.example.predicate;

import java.util.Arrays;
import java.util.List;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */

public class PredicateExample {

  public static void main(String[] args) {
    List<String> palavras = Arrays.asList("casa", "carro", "caminhonete", "varanda", "macarrão");

    palavras.stream()
        .filter(p -> p.length() > 5)
        .forEach(System.out::println);
  }

}
