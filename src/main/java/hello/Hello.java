package hello;

import io.vavr.collection.List;

// Changes introduced inside Github

public class Hello {
  public static void main(String ... args) {
    List.rangeClosed(1, 5)
      .map( i -> "idx: " + i)
      .forEach(System.out::println);
  }
}
