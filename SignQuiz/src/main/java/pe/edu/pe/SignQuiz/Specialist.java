package pe.edu.pe.SignQuiz;

public class Specialist extends Account{

    int amountLessons;
    int amountEvaluations;
    boolean learningRouteCreation;
    public Specialist(String name, String email, String password, String creditCardName, int creditCardNumber, int expDate, int amountLessons, int amountEvaluations, boolean learningRouteCreation) {
        super(name, email, password, creditCardName, creditCardNumber, expDate);
        this.amountLessons = amountLessons;
        this.amountEvaluations = amountEvaluations;
        this.learningRouteCreation = learningRouteCreation;
    }

    public void accessMenu(){}
}