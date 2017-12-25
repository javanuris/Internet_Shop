package kz.nuris.entities;

import javax.persistence.*;

/**
 * Created by User on 22.12.2017.
 */

@Entity
@Table(name = "users", schema = "internet_shop")
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Integer cash;
    private City city;
    private Role role;

    @Column(name = "first_name" ,nullable = false, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name" , nullable =  false , length = 45 )
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "email" , nullable = false , length = 60 , unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password" , nullable = false , length = 60)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "phone", nullable = false , length = 20)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "cash" ,nullable = false, columnDefinition = "int default 0", length = 10)
    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_city" , referencedColumnName = "id" ,nullable = false , foreignKey = @ForeignKey(name = "city_user_f"))
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_role" , referencedColumnName = "id",nullable = false , foreignKey = @ForeignKey(name = "role_user_f"))
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
