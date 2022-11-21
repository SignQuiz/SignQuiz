package pe.edu.pe.SignQuiz;

public class Lesson {
    int amountLessons;
    int amountViews;
    Apprentice apprentice;

    public Lesson(int amountLessons, int amountViews,Apprentice apprentice) {
        this.amountLessons = amountLessons;
        this.amountViews = amountViews;
        this.apprentice=apprentice;
    }

    public void selectLesson(){}
    public void exitLesson(){}
}
