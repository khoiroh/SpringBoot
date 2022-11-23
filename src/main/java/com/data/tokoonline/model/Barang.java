package com.data.tokoonline.model;

import javax.persistence.*;

@Entity
@Table (name = "barang")
public class Barang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (name = "price")
    private float price;

    @Column (name = "count")
    private Integer count;

    @Column (name = "reting")
    private Integer reting;

    @Lob
    @Column (name = "description")
    private String description;

    @Column (name = "publish")
    private boolean publish;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getReting() {
        return reting;
    }

    public void setReting(Integer reting) {
        this.reting = reting;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublish() {
        return publish;
    }

    public void setPublish(boolean publish) {
        this.publish = publish;
    }

    public Barang() {
    }

    public Barang(Long id, String name, float price, Integer count, Integer reting, String description, boolean publish) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
        this.reting = reting;
        this.description = description;
        this.publish = publish;
    }

    @Override
    public String toString() {
        return "Barang{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", reting=" + reting +
                ", description='" + description + '\'' +
                ", publish=" + publish +
                '}';
    }
}
