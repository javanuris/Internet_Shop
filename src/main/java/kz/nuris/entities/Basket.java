package kz.nuris.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 23.12.2017.
 */
@Entity
@Table(name = "baskets")
public class Basket extends BaseEntity {
    private Date startDate;
    private Integer count;
    private Good good;
    private User user;

    public Basket() {
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_date")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Column(name = "count", nullable = false, columnDefinition = "int default 1", length = 1)
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_good", nullable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "basket_good_f"))

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", nullable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "basket_user_f"))
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
