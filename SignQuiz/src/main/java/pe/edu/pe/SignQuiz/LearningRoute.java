package pe.edu.pe.SignQuiz;

import java.util.List;

public class LearningRoute {
    String levels;
    LessonDetail lesson;
    EvaluationDetail evaluation;
    Specialist specialist;
    public LearningRoute(String levels, LessonDetail lesson, EvaluationDetail evaluation) {
        this.levels = levels;
        this.lesson = lesson;
        this.evaluation = evaluation;
    }

    public void newLearningRoute(Specialist specialist){}
}
