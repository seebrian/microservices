package com.microservices.productservice.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    //GOOD PRACTICE TO SEPARATE MODEL ENTITY AND THE DTOS
    // should ont expose model entities to the ourside world
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
