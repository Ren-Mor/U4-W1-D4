package Esercizi;

public class Volontario implements CheckIn {
    private String name;
    private int age;
    private String CV;

    public Volontario(String name, int age, String CV){
        this.name = name;
        this.age = age;
        this.CV = CV;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCV() {
        return CV;
    }

    @Override
    public void checkin(){
        System.out.println("Il volontario: " + name + " ha iniziato il turno");
    }
}
