package devtest.demo.Domain;

import jakarta.persistence.*;


@Entity
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPoll;
    private String name;

    public Long getIdPoll() {
        return idPoll;
    }

    public void setIdPoll(Long idPoll) {
        this.idPoll = idPoll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
