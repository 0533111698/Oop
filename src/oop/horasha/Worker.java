package oop.horasha;

public class Worker extends Person {
    private String placeWorking;
    private int seniority;

    public Worker(String name, int age, int id, String placeWorking, int seniority) {
        super(name, age, id);
        this.placeWorking = placeWorking;
        this.seniority = seniority;
    }

    public String getPlaceWorking() {
        return placeWorking;
    }

    public void setPlaceWorking(String placeWorking) {
        this.placeWorking = placeWorking;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "placeWorking='" + placeWorking + '\'' +
                ", seniority=" + seniority +
                '}';
    }
    public void printWorker(){
        System.out.println(super.toString());
       System.out.println(this.toString());
    }
}
