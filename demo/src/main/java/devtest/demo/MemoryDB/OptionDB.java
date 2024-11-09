package devtest.demo.MemoryDB;

import devtest.demo.Domain.Poll;

import java.util.List;

public class OptionDB {
    private List<Poll> pollList;

    public List<Poll> getPollList() {
        return pollList;
    }

    public void setPollList(List<Poll> pollList) {
        this.pollList = pollList;
    }
}
