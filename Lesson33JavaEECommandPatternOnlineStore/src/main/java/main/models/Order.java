package main.models;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@EqualsAndHashCode
@Getter
@Setter
public class Order {
    private String id;
    private LocalDateTime localDateTime;
    private Product product;
    private Integer productCount;

    public Order(LocalDateTime localDateTime, Product product, Integer productCount) {
        this.localDateTime = localDateTime;
        this.product = product;
        this.productCount = productCount;
    }
}
