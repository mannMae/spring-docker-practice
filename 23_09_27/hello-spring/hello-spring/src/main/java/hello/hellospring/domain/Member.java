package hello.hellospring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {
    @Id
    private Long id;

    @Column(name ="name")
    private String name;

    public Long getId() { return id; }

    public String getName() { return name; }
}
