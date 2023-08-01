package com.company.ordermanagement.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Table(name = "ORDERMANAGEMENT_CUSTOMER")
@Entity(name = "ordermanagement_Customer")
@NamePattern("%s|name")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -315756667668459855L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "customer")
    private List<Address> address;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTHDAY")
    private Date birthday;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "customer")
    private List<Order> order;

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}