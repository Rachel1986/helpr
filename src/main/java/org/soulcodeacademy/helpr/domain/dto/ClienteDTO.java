package org.soulcodeacademy.helpr.domain.dto;

import javax.validation.constraints.NotBlank;

// DTO Verifica os dados inseridos de cliente
public class ClienteDTO extends UsuarioDTO{
@NotBlank(message = "O telefone do cliente é obrigatório.") // NotBlank verifica se o telefone está "" (string)
    private String telefone;                                // @NotNull => só verifica se tem valor ou não (objetos, integer, double)

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
