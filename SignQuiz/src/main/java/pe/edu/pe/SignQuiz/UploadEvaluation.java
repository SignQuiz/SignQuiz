package pe.edu.pe.SignQuiz;

import java.util.Date;

public class UploadEvaluation extends UploadMaterial{

    Date uploadEvaluationDate;
    int evaluationId;

    public UploadEvaluation(String title, Specialist specialist, LearningRoute learningRoute, Date uploadEvaluationDate, int evaluationId) {
        super(title, specialist, learningRoute);
        this.uploadEvaluationDate = uploadEvaluationDate;
        this.evaluationId = evaluationId;
    }

    @Override
    public void selectFile(){}
    @Override
    public void selectLocation(){}
    @Override
    public void upload(){}
}