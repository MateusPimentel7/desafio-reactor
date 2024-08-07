package br.com.dio.desafioreactor; // Ensure this matches the directory structure

import reactor.core.publisher.Flux;
import java.util.List;

 /*
    Recebe uma lista de longs, incrementa 1 nos valores e retorna um flux dos resultados

  */
public class Question1 {

    public Flux<Long> inc(final List<Long> numbers) {
        return Flux.fromIterable(numbers)
                .map(number -> number + 1);
    }
}
