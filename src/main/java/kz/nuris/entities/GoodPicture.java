package kz.nuris.entities;

import javax.persistence.*;

/**
 * Created by User on 23.12.2017.
 */
@Entity
@Table(name = "good_pictures")
public class GoodPicture extends BaseEntity {
    private String name;
    private String url;
    private Good good;

    public GoodPicture() {
    }

    @Column(name = "name" ,nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "picture_url" , nullable = false , length = 150)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @ManyToOne
    @JoinColumn(name = "id_good", nullable = false, referencedColumnName = "id" , foreignKey = @ForeignKey(name = "good_picture_good_f"))
    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }
}
