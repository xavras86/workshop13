package pl.zajavka;

import pl.zajavka.service.DataProcessingService;
import pl.zajavka.service.DataRepository;
import pl.zajavka.service.MainProcessor;
import pl.zajavka.service.StringPrepatationService;

public class Main {
    public static void main(String[] args) {
        MainProcessor mainProcessor = new MainProcessor(
                new DataRepository(),
                new DataProcessingService(
                        new StringPrepatationService()
                )
        );

    }
}