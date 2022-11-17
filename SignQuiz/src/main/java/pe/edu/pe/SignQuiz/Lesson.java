package pe.edu.pe.SignQuiz;

public class Lesson {

    String title;
    int amountLessons;
    int amountViews;
    Apprentice apprentice;

    public Lesson(String title, int amountLessons, int amountViews,Apprentice apprentice) {
        this.title = title;
        this.amountLessons = amountLessons;
        this.amountViews = amountViews;
        this.apprentice=apprentice;
    }

}
