package kz.nuris.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 24.12.2017.
 */

@Entity
@Table(name = "orders_arch", schema = "internet_shop")
public class OrderArch extends BaseEntity {

    private Good good;
    private User user;
    private Integer count;
    private Date endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_good", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "order_arch_good_f"))
    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "order_arch_user_f"))
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "count", nullable = false , columnDefinition = "int default 1", length = 5)
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_date",nullable = false)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
