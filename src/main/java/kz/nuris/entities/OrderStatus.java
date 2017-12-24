package kz.nuris.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by User on 24.12.2017.
 */
@Entity
@Table(name = "order_statuses", schema = "internet_shop")
public class OrderStatus extends BaseEntity{

    private String name;

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
