package firm.worker;

import firm.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "workers")
public class Worker extends BaseEntity {

    private String name;

    private String post;

    public Worker() {
    }

    public Worker(String name, String post) {
        this.name = name;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}
