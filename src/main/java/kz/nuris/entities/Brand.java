package kz.nuris.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by User on 23.12.2017.
 */
@Entity
@Table(name = "brands", schema = "internet_shop")
public class Brand extends BaseEntity {
    private String name;

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
