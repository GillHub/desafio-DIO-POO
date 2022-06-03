package desafioPOO;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java Course");
        course1.setDescription("Learning Java");
        course1.setDuration(6);

        Course course2 = new Course();
        course2.setTitle(" Learning C++");
        course2.setDescription("The ultimate methodologies to learn C++");
        course2.setDuration(8);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Java Mentorship");
        mentorship.setDescription("Acquire more knowledge about the Java Language");
        mentorship.setTime(LocalDate.now());

        
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer Bootcamp ");
        bootcamp.setDescription("Best Java Course Ever!");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship);

        Dev devPaloma = new Dev();
        devPaloma.setName("Paloma");
        devPaloma.enrollBootcamp(bootcamp);
        System.out.println("Subscribed Contents Paloma:" + devPaloma.getSubscribedContents());
        devPaloma.nextLevel();
        devPaloma.nextLevel();
        System.out.println("-");
        System.out.println("Subscribed Contents Paloma:" + devPaloma.getSubscribedContents());
        System.out.println("Finished Contents Paloma:" + devPaloma.getFinishedContents());
        System.out.println("XP:" + devPaloma.TotalXP());

        System.out.println("-------");

        Dev devJoe = new Dev();
        devJoe.setName("Joe");
        devJoe.enrollBootcamp(bootcamp);
        System.out.println("Subscribed Contents Joe:" + devJoe.getSubscribedContents());
        devJoe.nextLevel();
        devJoe.nextLevel();
        devJoe.nextLevel();
        System.out.println("-");
        System.out.println("Subscribed Contents Joe:" + devJoe.getSubscribedContents());
        System.out.println("Finished Contents Joe:" + devJoe.getFinishedContents());
        System.out.println("XP:" + devJoe.TotalXP());

    }

}
