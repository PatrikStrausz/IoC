package sk.it.strausz;

public class BaseballCoach implements Coach {

    private  FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Run for 30 minutes.";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}