package firm.jobType;

import firm.base.BaseEntity;

import javax.persistence.*;


@Entity
@Table(name = "job_types")
public class JobType extends BaseEntity {

    private String name;

    private Integer cost;

    public JobType() {
    }

    public JobType(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "JobType{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}