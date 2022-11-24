package pe.edu.pe.SignQuiz;

import java.util.Date;

public class UploadLesson extends UploadMaterial{

    Date uploadLessonDate;
    int lessonId;

    public UploadLesson(String title, Specialist specialist, LearningRoute learningRoute, Date uploadLessonDate, int lessonId) {
        super(title, specialist, learningRoute);
        this.uploadLessonDate = uploadLessonDate;
        this.lessonId = lessonId;
    }

    @Override
    public void selectFile(){}
    @Override
    public void selectLocation(){}
    @Override
    public void upload(){}
}