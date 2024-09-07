package person;

public class person {
    private String name;
    private int age;
    private  String gender;
    private String address;
    private String occupation:

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

   
    public String get() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    
    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }
     public String getoccupation() {
        return occupation;
    }

    public void setoccupation(String occupation) {
        this.occupation = occupation;
    }

    public static void main(String[] args) {
      
        Person person1 = new Person();
        person1.setName("Kamal Hasan");
        person1.setage(1200);
        person1.setgender(35000.00);
        person1.setaddress("Worker");
        person1.setoccupation("")
       
        Person person2 = new Person();
        person2.setName("Shoriful Islam");
        person2.setage(1201);
        person2.setgender(45000.00);
        person2.setaddress("Manager");
        person1.setoccupation("")

        
        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("age: " + person1.getage());
        System.out.println("gender: $" + person1.getgender());
        System.out.println("address: " + person1.getaddress());
        System.out.println("occupation: " + person1.getoccupation());

       
        System.out.println("\nPerson2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("age: " + person2.getage());
        System.out.println("gender: $" + person2.getgender());
        System.out.println("address:" + person2.getaddress());
        System.out.println("occupation: " + person2.getoccupation());
    }
}
