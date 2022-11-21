package pe.edu.pe.SignQuiz;

public abstract class UploadMaterial {
    String title;
    Specialist specialist;
    LearningRoute learningRoute;

    public UploadMaterial(String title,Specialist specialist, LearningRoute learningRoute) {
        this.title = title;
        this.specialist = specialist;
        this.learningRoute = learningRoute;
    }
    public void upload(){}
    public void selectFile(){}
    public void selectLocation(){}
}
