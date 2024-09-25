package com.api_vendinha.api.domain.dtos.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VendasRequestDto {
    private Long user_id;
    private Long product_id;
    private Integer quantity;
}
