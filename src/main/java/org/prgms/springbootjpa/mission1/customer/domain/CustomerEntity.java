package org.prgms.springbootjpa.mission1.customer.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class CustomerEntity {
    @Id
    private long id;
    private String firstName;
    private String lastName;

    public CustomerEntity(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public CustomerEntity() {

    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void changeFirstName(String changeName) {
        firstName = changeName;
    }
}