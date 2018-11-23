package firm.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import firm.base.BaseEntity;
import firm.client.Client;
import firm.contract.Contract;
import firm.worker.Worker;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

    @OneToOne
    private Contract contract;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Worker worker;

    private Integer area;

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date date;

    public Order() {
    }

    public Order(Contract contract, Client client, Worker worker, Integer area, Date date) {
        this.contract = contract;
        this.client = client;
        this.worker = worker;
        this.area = area;
        this.date = date;
    }

    public Contract getContract() {
        return contract;
    }

    public Client getClient() {
        return client;
    }

    public Worker getWorker() {
        return worker;
    }

    public Integer getArea() {
        return area;
    }

    public Date getDate() {
        return date;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "contract='" + contract + '\'' +
                "client='" + client + '\'' +
                ", worker='" + worker + '\'' +
                ", area='" + area + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}