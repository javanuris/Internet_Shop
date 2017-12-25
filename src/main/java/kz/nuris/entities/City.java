package kz.nuris.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by User on 22.12.2017.
 */
@Entity
@Table(name = "cities" , schema = "internet_shop")
public class City extends BaseEntity{

    private String name;
    private Set<User> users;

    @Column(name = "name" ,nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "city" , fetch = FetchType.LAZY)
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
