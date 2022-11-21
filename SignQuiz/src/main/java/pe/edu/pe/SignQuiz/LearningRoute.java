package pe.edu.pe.SignQuiz;

import java.util.List;

public class LearningRoute {
    String levels;
    LessonDetail lesson;
    EvaluationDetail evaluation;
    Specialist specialist;

    public LearningRoute(String levels, LessonDetail lesson, EvaluationDetail evaluation, Specialist specialist) {
        this.levels = levels;
        this.lesson = lesson;
        this.evaluation = evaluation;
        this.specialist = specialist;
    }



    public void newLearningRoute(String levels, LessonDetail lesson, EvaluationDetail evaluation, Specialist specialist){}
    public void editLearningRoute(String levels, LessonDetail lesson, EvaluationDetail evaluation, Specialist specialist){}

}
