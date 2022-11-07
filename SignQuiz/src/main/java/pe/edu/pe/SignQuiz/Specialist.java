package pe.edu.pe.SignQuiz;

public class Specialist extends Account{
    int amountLessons;
    public Specialist(int amountLessons,String name, String email, String password) {
        super(name, email, password);
        this.amountLessons=amountLessons;
    }
    public void accessMenu(){}
}
