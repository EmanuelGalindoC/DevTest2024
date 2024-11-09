package devtest.demo.Service;

import devtest.demo.Domain.Option;
import devtest.demo.Repository.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionService {

    @Autowired
    private OptionRepository optionRepository;

    public List<Option> getAllOptionsByPollId(Long pollId){
        List<Option> options = null;
        options.addAll(optionRepository.findAll());
        return options;
    }
}
