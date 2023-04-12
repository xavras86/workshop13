package pl.zajavka.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.zajavka.domain.User;

import java.util.Comparator;
import java.util.List;

@Slf4j
@AllArgsConstructor
public class DataProcessingService {

    private final StringPrepatationService stringPrepatationService;

    public List<String> process(final List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getBirth_date))
                .map(stringPrepatationService::prepare)
                .peek(line ->log.info("Prepared line: [{}]", line))
                .toList();

    }
}
