package com.mycompany.persons;

public class Persons {
  
    private String name;
    private int age;
    private String gender;
    private String address;
  
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
      
        Persons person1 = new Persons();
        person1.setName("Roman");
        person1.setAge(16);
        person1.setGender("Male");
        person1.setAddress("Chattogram");
        
       
        Persons person2 = new Persons();
        person2.setName("Romana");
        person2.setAge(15);
        person2.setGender("Female");
        person2.setAddress("Dhaka");
        
        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());
        System.out.println("Address: " + person1.getAddress());
        
        System.out.println("\nPerson 2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Gender: " + person2.getGender());
        System.out.println("Address: " + person2.getAddress());
    }
}
