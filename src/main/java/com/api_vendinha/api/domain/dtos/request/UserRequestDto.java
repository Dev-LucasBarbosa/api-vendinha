package com.api_vendinha.api.domain.dtos.request;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DTO para representar os dados necessários para criar ou atualizar um usuário.
 */
@Data // Gera automaticamente métodos getters, setters, toString, equals e hashCode.
@NoArgsConstructor // Gera um construtor sem argumentos, necessário para a criação de instâncias pelo JPA e outras operações.
public class UserRequestDto {

    /**
     * Nome do usuário.
     *
     * Este campo é obrigatório e será utilizado para criar ou atualizar um usuário no sistema.
     */
    private String name;
    private String email;
    private String password;
    private Boolean is_active;
    private String cpf_cnpj;
    private List<ProdutosRequestDto> produtosRequestDtos;

}
