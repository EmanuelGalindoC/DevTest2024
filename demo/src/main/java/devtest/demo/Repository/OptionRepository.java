package devtest.demo.Repository;

import devtest.demo.Domain.Option;
import devtest.demo.Domain.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepository extends JpaRepository<Option, Long> {

}
