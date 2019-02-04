import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class PersonReader {

    public static void main(String[] args)
    {
        PrintWriter out;
        Scanner in; // in is the file we are reading
        Scanner console = new Scanner(System.in);
        File selectedFile;
        JFileChooser chooser = new JFileChooser();
        String line;
        int lineCnt = 0;

        try
        {
            File workingDirectory = new File(System.getProperty("PersonList.dir"));
            chooser.setCurrentDirectory(workingDirectory);

            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                selectedFile = chooser.getSelectedFile();
                in = new Scanner(selectedFile);
                String id = "ID#";
                String firstName = "Firstname";
                String lastName = "Lastname";
                String title = "Title";
                String dob = "YOB";
                String divide = "=======================================================================";

                System.out.printf("%-12s %12s %12s %12s %12s %n", id, firstName, lastName, title, dob);
                System.out.println(divide);
                BufferedReader br = new BufferedReader(new FileReader(selectedFile));
                String line2 = null;
                ArrayList<Person> person = new ArrayList<Person>();

                while ((line2 = br.readLine()) != null) {
//                    String[] values = line2.split(",");
//                    for (String str : values) {
//                        System.out.printf("%-15s", str);
//
//                    }
//                    System.out.println("");
                    System.out.printf("%15s", person);
                }
                br.close();
                in.close();

            }
            else
            {
                JOptionPane.showMessageDialog(null, "Cancelled by User.  Exiting now........");
                System.exit(0);
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File is not found!");
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

}

