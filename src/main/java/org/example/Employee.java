package org.example;

public class Employee {

    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(long id, String fullName, String email,String password,String[] healthPlans){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthPlans=healthPlans;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthPlans(String[] healthplans) {
        this.healthPlans = healthplans;
    }

    public void addHealthPlan(int index, String name){

        if (index < 0 || index >= healthPlans.length) {
            System.out.println("Hata: Geçersiz index.");
            return;
        }

        if (healthPlans[index] == null) {
            healthPlans[index] = name;

        } else {

            System.out.println("Bu index dolu");
        }
    }

    @Override
    public String toString() {
        return "id: " + id + " " + "İsim: " + fullName + " " + "Email: " + email;
    }

}
