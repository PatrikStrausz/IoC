package sk.it.strausz;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Run for 30 minutes.";
    }
}