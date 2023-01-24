import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileRead {
    public static void main(String[] args) {
        try {
            File x = new File("first.txt");
            Scanner read = new Scanner(x);
            while (read.hasNextLine()) {
                String y = myReader.nextLine();
                System.out.println(y)
            }
        }
        read.close();
        catch (FileNotFoundExeption e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}


public class fileWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("second.txt");
            writer.write("hello world");
            writer.close();
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}


public class customException extends Exception {
    
        
    }
}