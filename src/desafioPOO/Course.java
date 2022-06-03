package desafioPOO;

public class Course extends Contents{

    private int Duration;

    @Override
    public double XP() {
        return XP * Duration;
    }

    public Course() {
    }


    public int getDuration() {
        return Duration;
    }

    public void setDuration(int Duration) {
        this.Duration = Duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", descricption='" + getDescription() + '\'' +
                ", duration=" + Duration +
                '}';
    }
}
