package desafioPOO;


import java.time.LocalDate;

public class Mentorship extends Contents{

    private LocalDate time;

    @Override
    public double XP() {
        return XP + 15d;
    }

    public Mentorship() {
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", time=" + time +
                '}';
    }
}
