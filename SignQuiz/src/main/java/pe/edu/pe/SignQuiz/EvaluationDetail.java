package pe.edu.pe.SignQuiz;

public class EvaluationDetail {
    String title;
    int correctAnswer;
    int wrongAnswers;
    String options;
    Specialist specialist;
    public EvaluationDetail(String title, int correctAnswer, int wrongAnswers, String options, Specialist specialist) {
        this.title = title;
        this.correctAnswer = correctAnswer;
        this.wrongAnswers = wrongAnswers;
        this.options = options;
        this.specialist = specialist;
    }

    public void selectAnswer(){}

}
