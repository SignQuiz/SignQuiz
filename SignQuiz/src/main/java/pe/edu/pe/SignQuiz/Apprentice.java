package pe.edu.pe.SignQuiz;

public class Apprentice extends Account{
    boolean versionPremium;
    int attempts;

    public Apprentice(String name,String email,String password,String creditCardName, int creditCardNumber, int expDate,boolean versionPremium, int attempts) {
        super(name,email,password,creditCardName,creditCardNumber,expDate);
        this.versionPremium = versionPremium;
        this.attempts = attempts;
    }
    public void accessMenu(){}

}
