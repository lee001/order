package com.example.order.client;

import com.example.order.dataobject.ProductInfo;
import com.example.order.dto.CartDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "product")
public interface ProductClient {

    @GetMapping("/msg")
    String productMsg();

    /**
     * 查询商品信息(调用商品服务)
     * @param productIdList
     * @return
     */
    @PostMapping("/product/listForOrder")
    public List<ProductInfo> listForOrder(@RequestBody List<String> productIdList);

    /**
     * 扣库存(调用商品服务)
     * @param carDTOList
     */
    @PostMapping("/product/decreaseStock")
    public void decreaseStock(@RequestBody List<CartDTO> carDTOList);
}
