package pe.edu.pe.SignQuiz;

public class LessonDetail {
    Specialist specialist;
    Lesson lesson;
    String title;

    public LessonDetail(String title, Specialist specialist, Lesson lesson) {
        this.title = title;
        this.specialist = specialist;
        this.lesson = lesson;
    }



    public void seeLesson(){}

}
