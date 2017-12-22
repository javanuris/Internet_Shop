package kz.nuris.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by User on 22.12.2017.
 */
@MappedSuperclass
public abstract class BaseEntity {
    private Integer id;

    public BaseEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
