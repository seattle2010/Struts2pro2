package com.shopping.query;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

//SELECT * FROM product WHERE productName LIKE '%M%' AND salePrice >= 100 AND salePrice <=200
@Getter
@Setter
public class ProductQueryObject extends QueryObject {
    private String name;
    private BigDecimal minSalePrice;
    private BigDecimal maxSalePrice;

    @Override
    protected void customizedQuery() {
if(hasLength(name)){
    conditions.add("productName LIKE ?");
    parameters.add("%" + name + "%");
}
if(minSalePrice != null){
    conditions.add("salePrice >= ?");
    parameters.add(maxSalePrice);
}

    }
}
