package main.models;

import lombok.*;

import java.math.BigDecimal;

@ToString
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Product {
    private Long id;
    private String orderName;
    private BigDecimal price;
    private ProductType productType;
    private String info;
}
