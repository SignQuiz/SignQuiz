package pe.edu.pe.SignQuiz;
import java.util.ArrayList;
import java.util.List;

public class Evaluation {
    Apprentice apprentice;
    int amountEvaluations;
    String title;
    int amountMade;
    EvaluationDetail evaluation;
    public Evaluation(Apprentice apprentice, int amountEvaluations, String title, int amountMade, EvaluationDetail evaluation) {
        this.apprentice = apprentice;
        this.amountEvaluations = amountEvaluations;
        this.title = title;
        this.amountMade = amountMade;
        this.evaluation = evaluation;
    }
    public void selectEvaluation(){}
}
