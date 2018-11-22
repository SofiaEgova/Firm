package firm.contract;

import firm.base.BaseEntity;
import firm.client.Client;
import firm.jobType.JobType;

import javax.persistence.*;


@Entity
@Table(name = "contracts")
public class Contract extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private JobType jobType;

    @ManyToOne
    private Client client;

    public Contract() {
    }

    public Contract(JobType jobType, Client client) {
        this.jobType = jobType;
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public JobType getJobType() {
        return jobType;
    }

    public Client getClient() {
        return client;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id='" + id + '\'' +
                "jobType='" + jobType + '\'' +
                ", client='" + client + '\'' +
                '}';
    }
}