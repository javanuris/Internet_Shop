package kz.nuris.entities;


import javax.persistence.*;
import java.util.Set;

/**
 * Created by User on 24.12.2017.
 */
@Entity
@Table(name = "order_statuses", schema = "internet_shop")
public class OrderStatus extends BaseEntity{

    private String name;
    private Set<Order> orders;

    @Column(name = "name" ,nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "orderStatus" , fetch = FetchType.LAZY )
    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
