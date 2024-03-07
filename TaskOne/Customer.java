package TaskOne;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter;

    public String getfirstName(){
        return firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public String getuserName(){
        return userName;
    }

    public int getid(){
        return id;
    }
    Customer(String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = counter;
        counter++;
    }
    public String  toString() {
        return "Customer ID: " + id + "\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Username: " + userName + "\n";

    }



}
