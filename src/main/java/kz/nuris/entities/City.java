package kz.nuris.entities;

import javax.persistence.*;

/**
 * Created by User on 22.12.2017.
 */
@Entity
@Table(name = "cities" , schema = "internet_shop")
public class City extends BaseEntity{

    private String name;

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
