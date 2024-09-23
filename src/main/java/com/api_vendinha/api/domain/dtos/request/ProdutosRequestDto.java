package com.api_vendinha.api.domain.dtos.request;

import com.api_vendinha.api.domain.entities.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProdutosRequestDto {
    private String nome;
    private Integer quantidade;
    private Float preco;
}
