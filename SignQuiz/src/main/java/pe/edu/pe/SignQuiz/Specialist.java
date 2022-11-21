package pe.edu.pe.SignQuiz;

public class Specialist extends Account{
    int amountLessons;
    int amountEvaluations;
    public Specialist(int amountLessons,int amountEvaluations,String name, String email, String password,String creditCardName, int creditCardNumber, int expDate) {
        super(name, email, password,creditCardName,creditCardNumber,expDate);
        this.amountLessons=amountLessons;
        this.amountEvaluations=amountEvaluations;
    }
    public void accessMenu(){}
}
