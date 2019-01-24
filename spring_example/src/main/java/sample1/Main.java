package sample1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

enum LoggerType {Console, File};

public class Main {
    static LoggerType loggerType = LoggerType.File;
    static boolean usePreprocessors = true;

    public static void main(String[] args) {


        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-config.xml");
        try {
            Car car = ctx.getBean("car", Car.class);
            System.out.println(car);
        } finally {
            ctx.close();
        }
    }
}
