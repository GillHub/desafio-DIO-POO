package desafioPOO;

import java.util.*;

public class Dev {
    private String name;
    private Set<Contents> subscribedContents = new LinkedHashSet<>();
    private Set<Contents> finishedContents = new LinkedHashSet<>();

    public void enrollBootcamp(Bootcamp bootcamp){
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getDevsEnrolled().add(this);
    }

    public void nextLevel() {
        Optional<Contents> contents = this.subscribedContents.stream().findFirst();
        if(contents.isPresent()) {
            this.finishedContents.add(contents.get());
            this.subscribedContents.remove(contents.get());
        } else {
            System.err.println("You are not subscribed!");
        }
    }
       	   	
    	
    
    public double TotalXP() {
        Iterator<Contents> iterator = this.finishedContents.iterator();
        double sum = 0;
        while(iterator.hasNext()){
            double next = iterator.next().XP();
            sum += next;
        }
        return sum;

        
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Contents> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Contents> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Contents> getFinishedContents() {
        return finishedContents;
    }

    public void setFinishedContents(Set<Contents> finishedContents) {
        this.finishedContents = finishedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContents, dev.subscribedContents) && Objects.equals(finishedContents, dev.finishedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContents, finishedContents);
    }

	
		
		
	}
	
	

