package pe.edu.pe.SignQuiz;

public class EvaluationDetail {

    int correctAnswer;
    int wrongAnswers;
    String options;
    Specialist specialist;

    public EvaluationDetail(int correctAnswer, int wrongAnswers,String options, Specialist specialist) {
        this.correctAnswer = correctAnswer;
        this.wrongAnswers = wrongAnswers;
        this.options = options;
        this.specialist = specialist;
    }

    public void selectAnswer(){}

}
