package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        List<String> whain = new ArrayList<>();
        String path = "C:\\Users\\vlada\\IdeaProjects\\wchain\\src\\com\\company\\logs";
        File file = new File(path);
        Scanner scannerfile = new Scanner(file);

        while (scannerfile.hasNextLine()) {
            whain.add(scannerfile.nextLine());
        }

        String[] s = whain.toArray(new String[0]);
        Whain sol = new Whain();

        try {
            FileWriter myWriter = new FileWriter("wchaout.txt");

            myWriter.write("Counter: "+ sol.longestStrChain(s));

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
