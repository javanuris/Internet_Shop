package kz.nuris.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 23.12.2017.
 */
@Entity
@Table(name = "reviews")
public class Review extends BaseEntity {

    private String name;
    private Integer rating;
    private User user;
    private Good good;
    private Date startDate;

    public Review() {
    }

    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "rating", nullable = false, length = 1, columnDefinition = "int default 5")
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "review_user_f"))
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "id_good", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "review_good_f"))
    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_date")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}

