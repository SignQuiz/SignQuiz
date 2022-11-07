package pe.edu.pe.SignQuiz;

public class Charge  extends Credit{
    SpecialistPerformance performance;
    public Charge( SpecialistPerformance performance,String name, String type, String expDate) {
        super(name, type, expDate);
        this.performance =performance;
    }
    public void getAmount(){}
    public void getCommission(Specialist specialist){}
}
