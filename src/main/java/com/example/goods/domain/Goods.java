package com.example.goods.domain;

import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Alias("Goods")
public class Goods {
    private Integer id;
    private String name;
    private String status;
    private String district;
    private Integer price;
    private Integer count;
    private Date time;

    public Goods() {
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", district='" + district + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", time=" + time +
                '}';
    }

    public Goods(String name, String status, String district, Integer price, Integer count, Date time) {
        this.name = name;
        this.status = status;
        this.district = district;
        this.price = price;
        this.count = count;
        this.time = time;
    }

    public Goods(Integer id, String name, String status, String district, Integer price, Integer count, Date time) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.district = district;
        this.price = price;
        this.count = count;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
