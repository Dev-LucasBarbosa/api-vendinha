package com.api_vendinha.api.domain.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VendasResponseDto {
    private Long id;
    private Long user_id;
    private Long product_id;
    private Integer quantity;
    private Float price;
}