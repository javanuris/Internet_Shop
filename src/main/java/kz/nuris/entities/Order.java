package kz.nuris.entities;

/**
 * Created by User on 24.12.2017.
 */

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders", schema = "internet_shop")
public class Order extends BaseEntity {

    private Good good;
    private User user;
    private OrderStatus orderStatus;
    private Integer count;
    private Date startDate;

    @ManyToOne
    @JoinColumn(name = "id_good")
    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }
    @ManyToOne
    @JoinColumn(name = "id_user")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @ManyToOne
    @JoinColumn(name = "id_order_status")
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Column(name = "start_date")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
