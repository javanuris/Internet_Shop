package kz.nuris.entities;

/**
 * Created by User on 24.12.2017.
 */

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

    private Good good;
    private User user;
    private OrderStatus orderStatus;
    private Integer count;
    private Date startDate;
    private Set<Terminal> terminals;

    public Order() {
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_good", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "order_good_f"))
    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "order_user_f"))
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order_status", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "order_order_status_f"))
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Column(name = "count", nullable = false, columnDefinition = "int default 1", length = 4)
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_date")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }


    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    public Set<Terminal> getTerminals() {
        return terminals;
    }

    public void setTerminals(Set<Terminal> terminals) {
        this.terminals = terminals;
    }
}
