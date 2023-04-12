package pl.zajavka.service;

import org.springframework.stereotype.Service;
import pl.zajavka.domain.User;

@Service
public class StringPrepatationService {
    public String prepare(final User user) {
        return String.format("%S;%S", user.getBirth_date(), user.getEmail());
    }
}
