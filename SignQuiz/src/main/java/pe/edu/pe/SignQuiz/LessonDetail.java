package pe.edu.pe.SignQuiz;

public class LessonDetail {
    Specialist specialist;
    Lesson lesson;
    String title;
    int amountViews;
    public LessonDetail(Specialist specialist, Lesson lesson, String title, int amountViews) {
        this.specialist = specialist;
        this.lesson = lesson;
        this.title = title;
        this.amountViews = amountViews;
    }


    public void seeLesson(){}

}
