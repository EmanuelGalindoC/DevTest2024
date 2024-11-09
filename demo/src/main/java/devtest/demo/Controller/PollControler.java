package devtest.demo.Controller;

import devtest.demo.Domain.Poll;
import devtest.demo.Service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/polls")
public class PollControler {

    @Autowired
    private PollService pollService;

    @GetMapping
    public List<Poll> getAllPolls(){
        return pollService.getAllPolls();
    }

    @PostMapping
    public Poll createPoll(@RequestBody Poll poll){
        return pollService.createPoll(poll);
    }
}
