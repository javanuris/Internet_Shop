package kz.nuris.entities;

import javax.persistence.*;

/**
 * Created by User on 23.12.2017.
 */
@Entity
@Table(name = "good_pictures", schema = "internet_shop")
public class GoodPicture extends BaseEntity {
    private String name;
    private String url;
    private Good good;

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "picture_url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @ManyToOne
    @JoinColumn(name = "id_good")
    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }
}
