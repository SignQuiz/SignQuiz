package pe.edu.pe.SignQuiz;
import java.util.ArrayList;
import java.util.List;

public class Evaluation {
    Apprentice apprentice;
    int amountEvaluations;
    int amountMade;
    public Evaluation(Apprentice apprentice, int amountEvaluations, String title, int amountMade) {
        this.apprentice = apprentice;
        this.amountEvaluations = amountEvaluations;
        this.amountMade = amountMade;
    }
    public void selectEvaluation(){}
}
