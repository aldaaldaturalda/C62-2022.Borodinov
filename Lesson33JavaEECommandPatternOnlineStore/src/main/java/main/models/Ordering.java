package main.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Ordering {
    private String order;
    private LocalDateTime localDateTime;
    private List<Order> products;
}
