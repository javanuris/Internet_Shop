package kz.nuris.entities;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 23.12.2017.
 */
@Entity
@Table(name = "baskets", schema = "internet_shop")
public class Basket extends BaseEntity {
    private Date startDate;
    private Integer count;
    private Good good;
    private User user;

    @Column(name = "start_date")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

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
}
