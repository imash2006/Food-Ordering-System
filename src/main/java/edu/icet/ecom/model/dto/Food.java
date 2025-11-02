package edu.icet.ecom.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Food {
    private String name;
    private String details;
    private String quantity;
    private Double price;
}
