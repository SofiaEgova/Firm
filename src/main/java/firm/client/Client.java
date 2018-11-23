package firm.client;

import firm.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client extends BaseEntity {

    private String name;

    private Integer phoneNumber;

    public Client() {
    }

    public Client(String name, Integer phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
