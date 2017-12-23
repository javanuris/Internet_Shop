package kz.nuris.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by User on 22.12.2017.
 */
@Entity
@Table(name = "roles", schema = "internet_shop")
public class Role extends BaseEntity {
    private String name;

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
