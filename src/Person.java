import java.util.Calendar;


public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    public Person(String ID, String firstName, String lastName, String title, int YOB){
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = SafeInput.getRangedIntDialog("Enter a year between",1940,2010);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = SafeInput.getRangedIntDialog("Enter a year between",1940,2010);
    }

    public String fullName(){
        String full = this.firstName + " " + this.lastName;
        return full;
    }
    public String formalName(){
        String formal = this.title + " " + this.lastName;
        return formal;
    }

    public static int getAge(int year){
        Calendar c = Calendar.getInstance();
        int recent = c.get(Calendar.YEAR);
        int age = recent - year;
        return age;
    }

    public String toCSVDataRecord(){
        String formattedInfo = this.ID+ ","+this.firstName+ ","+ this.lastName+","+this.title+","+this.YOB;
        return formattedInfo;
    }







    }











