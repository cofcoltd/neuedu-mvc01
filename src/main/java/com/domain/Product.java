package com.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {

    private Integer pid;
    private String pname;
    private BigDecimal price;
    private String description;
    private String imgs;



    @Override
    public String toString() {

        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("pid=").append(pid);
        sb.append(", pname='").append(pname).append('\'');
        sb.append(", price=").append(price);
        sb.append(", description='").append(description).append('\'');
        sb.append(", imgs='").append(imgs).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
