package org.example.consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerExample {

  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
//ctrl + alt + l = organiza o código
    integers.forEach(n -> {
          if (n % 2 == 0) {
            System.out.println(n);
          }
        }
    );
  }
}
