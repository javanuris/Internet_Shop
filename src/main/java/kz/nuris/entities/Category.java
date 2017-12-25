package kz.nuris.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by User on 23.12.2017.
 */
@Entity
@Table(name = "categories", schema = "internet_shop")
public class Category extends BaseEntity {

    private String name;
    private Set<Good>goods;

    @Column(name = "name" ,nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "category" , fetch = FetchType.LAZY )
    public Set<Good> getGoods() {
        return goods;
    }

    public void setGoods(Set<Good> goods) {
        this.goods = goods;
    }
}
