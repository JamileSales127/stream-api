package org.example.consumer;

import java.util.Arrays;
import java.util.List;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado. É
 * utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem
 * modificar, ou retornar um valor.
 */

public class ConsumerExample {

  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
//ctrl + alt + l = organiza o código
    integers.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);
  }
}
