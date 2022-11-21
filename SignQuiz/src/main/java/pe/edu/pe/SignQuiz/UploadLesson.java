package pe.edu.pe.SignQuiz;

public class UploadLesson extends UploadMaterial{

    public UploadLesson(String title, Specialist specialist, LearningRoute learningRoute) {
        super(title, specialist, learningRoute);
    }

    @Override
    public void selectFile(){}
    @Override
    public void selectLocation(){}
    @Override
    public void upload(){}
}
