import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class PersonGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println("How many people are you adding?: ");
        count = sc.nextInt();

        ArrayList<Person> personList = new ArrayList<Person>();


        for (int i = 0; i < count; i++) {
            System.out.println("Enter the first name: ");
            String firstName = sc.next();


            System.out.println("Enter the last name: ");
            String lastName = sc.next();

            System.out.println("Enter title: ");
            String title = sc.next();

            System.out.println("Please enter the year of birth: ");
            int YOB = sc.nextInt();
            String ID = "000" + (i + 1);
            ID = ID.substring(ID.length()-4);
            Person person = new Person(ID, firstName, lastName, title, YOB);

            personList.add(person);
        }

        //writing file
        PersonGenerator.fileWriter(personList);

    }


    public static void fileWriter(ArrayList<Person> personArrayList)
    {
        String fileName = "PersonList.csv";
        try{
            PrintWriter file = new PrintWriter(fileName);
            for(int i =0; i < personArrayList.size(); i++){
                Person person = personArrayList.get(i);
                file.println(person.toCSVDataRecord());
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("error: file not found: ");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("error: exception not found: ");
            e.printStackTrace();

        }
    }
}
