package com.example.order.dto;

import com.netflix.discovery.converters.Auto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDTO {

    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

}
