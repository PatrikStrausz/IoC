package sk.it.strausz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/applicationContext.xml");

        Coach coach = context.getBean("baseballCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
