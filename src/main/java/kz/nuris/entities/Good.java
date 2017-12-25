package kz.nuris.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by User on 23.12.2017.
 */
@Entity
@Table(name = "goods", schema = "internet_shop")
public class Good extends BaseEntity {

    private String name;
    private Integer price;
    private Integer count;
    private String description;
    private Brand brand;
    private Category category;
    private GoodType goodType;
    private Set<GoodPicture> goodPictures;
    private Set<Basket> baskets;
    private Set<Order> orders;
    private Set<OrderArch> orderArches;

    @Column(name = "name" ,nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "price" , nullable = false , columnDefinition = "int default 0", length = 7)
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Column(name = "count", nullable = false , columnDefinition = "int default 0", length = 7)
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Column(name = "description" , length = 500)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_brand", nullable = false , referencedColumnName = "id", foreignKey = @ForeignKey(name="good_brand_f"))
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category", nullable = false , referencedColumnName = "id", foreignKey = @ForeignKey(name="good_category_f"))
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_good_type", nullable = false , referencedColumnName = "id", foreignKey = @ForeignKey(name="good_good_type_f"))
    public GoodType getGoodType() {
        return goodType;
    }

    public void setGoodType(GoodType goodType) {
        this.goodType = goodType;
    }

    @OneToMany(mappedBy = "good" , fetch = FetchType.LAZY )
    public Set<GoodPicture> getGoodPictures() {
        return goodPictures;
    }

    public void setGoodPictures(Set<GoodPicture> goodPictures) {
        this.goodPictures = goodPictures;
    }

    @OneToMany(mappedBy = "good" , fetch = FetchType.LAZY )
    public Set<Basket> getBaskets() {
        return baskets;
    }

    public void setBaskets(Set<Basket> baskets) {
        this.baskets = baskets;
    }

    @OneToMany(mappedBy = "good" , fetch = FetchType.LAZY )
    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @OneToMany(mappedBy = "good" , fetch = FetchType.LAZY )
    public Set<OrderArch> getOrderArches() {
        return orderArches;
    }

    public void setOrderArches(Set<OrderArch> orderArches) {
        this.orderArches = orderArches;
    }
}
