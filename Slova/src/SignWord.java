import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SignWord {
    int sign;
    int probel;
    int slova;

    void  SignSlova(File myObj) throws FileNotFoundException{
        Scanner myReader  = new Scanner(myObj);
        while (myReader.hasNextLine()){
            String data =  myReader.nextLine();
            sign += data.length();
            char[] dataChar = data.toCharArray();{
                for(int i = 0; !(i >= data.length()); i++){

                }

            }
        }
    }
}
