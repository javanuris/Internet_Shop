package kz.nuris.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by User on 22.12.2017.
 */

@Entity
@Table(name = "users", schema = "internet_shop")
public class UserEntity extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Integer cash;
    private CityEntity cityEntity;
    private RoleEntity roleEntity;

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "cash")
    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    @ManyToOne
    public CityEntity getCityEntity() {
        return cityEntity;
    }

    public void setCityEntity(CityEntity cityEntity) {
        this.cityEntity = cityEntity;
    }

    @ManyToOne
    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }
}
