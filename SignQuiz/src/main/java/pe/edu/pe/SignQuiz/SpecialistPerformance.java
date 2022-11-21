package pe.edu.pe.SignQuiz;

public class SpecialistPerformance {
    Evaluation evaluations;
    Lesson lesson;
    Specialist specialist;
    public SpecialistPerformance(Lesson lesson,Evaluation evaluations,Specialist specialist) {
        this.lesson = lesson;
        this.evaluations = evaluations;
        this.specialist=specialist;
    }
    public void showCharts(){}
}
