package pl.zajavka.service;

import pl.zajavka.domain.User;

public class StringPrepatationService {
    public String prepare(final User user) {
        return String.format("%S;%S", user.getBirth_date(), user.getEmail());
    }
}
