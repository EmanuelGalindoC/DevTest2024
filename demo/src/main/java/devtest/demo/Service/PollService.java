package devtest.demo.Service;

import devtest.demo.Domain.Poll;
import devtest.demo.Repository.OptionRepository;
import devtest.demo.Repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollService {
    @Autowired
    private PollRepository pollRepository;


    public List<Poll> getAllPolls(){
        return pollRepository.findAll();
    }

    public Poll createPoll(Poll poll){
        return pollRepository.save(poll);
    }
}
