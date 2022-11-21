package pe.edu.pe.SignQuiz;

public class Account {

    protected String name;
    protected String email;
    protected String password;
    protected String creditCardName;
    protected int creditCardNumber;
    protected int expDate;

    public Account(String name, String email, String password, String creditCardName, int creditCardNumber, int expDate) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.creditCardName = creditCardName;
        this.creditCardNumber = creditCardNumber;
        this.expDate = expDate;
    }

    public void register(){}
    public void login(){}
}
