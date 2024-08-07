package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

public class Question3 {

    /*
    Verifica se o usuário passado é valido, caso seja retorna void, caso contrário deve disparar uma exception
    (para esse desafio vamos considerar que o usário é valido quando ele tem uma senha com mais de 8 caracteres)
    */
    public Mono<Void> userIsValid(final User user) {
        return Mono.create(sink -> {
            if (user.password() != null && user.password().length() > 8) {
                sink.success();
            } else {
                sink.error(new IllegalArgumentException("A senha deve conter mais que 8 caracteres!"));
            }
        });
    }
}
