package kz.nuris.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by User on 23.12.2017.
 */
@Entity
@Table(name = "brands")
public class Brand extends BaseEntity {
    private String name;
    private Set<Good> goods;

    public Brand() {
    }

    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
    public Set<Good> getGoods() {
        return goods;
    }

    public void setGoods(Set<Good> goods) {
        this.goods = goods;
    }
}
