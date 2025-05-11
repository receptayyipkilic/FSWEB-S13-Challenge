package org.example;

public class Company {

    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames ) {
        this.id = id;
        this.name=name;
        this.giro=giro;
        this.developerNames=developerNames;
    }

    public Company(double giro) {
        if (giro<0) {
            this.giro=0;
        }
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public double getGiro() {
        return giro;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void addEmployee(int index, String name){

        if (index < 0 || index >= this.developerNames.length) {
            System.out.println("Hata: Geçersiz index.");
            return;
        }

        if (this.developerNames[index] == null) {
            this.developerNames[index] = name;

        } else {

            System.out.println("Bu index dolu");
        }
    }

    @Override
    public String toString() {
        return "id: " + id + " " + "İsim: " + name + " " + "Giro: " + giro;
    }
}
