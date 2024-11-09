package devtest.demo.Domain;

import jakarta.persistence.*;


@Entity
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOption;
    private String name;
    private Long votes;

    private Long pollId;

    public Long getIdOption() {
        return idOption;
    }

    public void setIdOption(Long idOption) {
        this.idOption = idOption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getVotes() {
        return votes;
    }

    public void setVotes(Long votes) {
        this.votes = votes;
    }
}
