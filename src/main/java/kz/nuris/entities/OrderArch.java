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

    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Column(name = "end_date")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
