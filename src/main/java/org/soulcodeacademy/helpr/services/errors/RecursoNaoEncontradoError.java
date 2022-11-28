package org.soulcodeacademy.helpr.services.errors;

// Esta classe representa um erro de regra de negócio qdo não encontramos cargos, clientes,
// funcionários, chamados no Banco.
public class RecursoNaoEncontradoError extends RuntimeException {
    public RecursoNaoEncontradoError(String message) {
        super(message); // Passamos a mensagem p/ a Runtime
    }
}
