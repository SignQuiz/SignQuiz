package pe.edu.pe.SignQuiz;

public class Apprentice extends Account{
    boolean versionPremium;

    String level;
    int attempts;
    String learningRouteLevel;

    public Apprentice(String name, String email, String password, String creditCardName, int creditCardNumber, int expDate, boolean versionPremium, int attempts, String learningRouteLevel,String level) {
        super(name, email, password, creditCardName, creditCardNumber, expDate);
        this.versionPremium = versionPremium;
        this.attempts = attempts;
        this.learningRouteLevel = learningRouteLevel;
        this.level=level;
    }

    public void accessMenu(){}

}
