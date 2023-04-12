package pl.zajavka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.zajavka.configutarion.ApplicationConfiguration;
import pl.zajavka.service.DataProcessingService;
import pl.zajavka.service.DataRepository;
import pl.zajavka.service.MainProcessor;
import pl.zajavka.service.StringPrepatationService;

public class Main {
    public static void main(String[] args) {
//        MainProcessor mainProcessor = new MainProcessor(
//                new DataRepository(),
//                new DataProcessingService(
//                        new StringPrepatationService()
//                )
//        );
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        MainProcessor mainProcessor = context.getBean(MainProcessor.class);
        mainProcessor.process();

    }
}