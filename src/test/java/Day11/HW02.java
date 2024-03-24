package Day11;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HW02 {
    public static void main(String[] args) {


        //Create a File on Desktop
        String userHome = System.getProperty("user.home");
        String sepertor = System.getProperty("file.separator");

        //Desktop
        File file = new File(userHome + sepertor + "Desktop" + sepertor + "FileExist");

        // Verify that the file exists
        if (file.exists())
            System.out.println("Exists");
        else
            System.out.println("Dose not exists");
    }
}
