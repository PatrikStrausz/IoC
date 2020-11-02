package sk.it.strausz;

public class TrackCoach implements Coach {

    private  FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a half-marathon.";
    }

    @Override
    public String getDailyFortune() {
        return "Justo do it: "+fortuneService.getFortune();
    }
}

