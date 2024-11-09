package devtest.demo.Controller;

import devtest.demo.Domain.Option;
import devtest.demo.Service.OptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/options")
public class OptionController {

    @Autowired
    private OptionService optionService;

    @GetMapping("/{pollId}")
    public List<Option> getOptionsByPollId(@PathVariable Long pollId){
        return optionService.getAllOptionsByPollId(pollId);
    }
}
