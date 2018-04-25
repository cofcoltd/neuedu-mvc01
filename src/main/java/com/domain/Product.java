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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

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
