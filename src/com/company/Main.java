package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Main {



    public static void main(String[] args) throws FileNotFoundException {
        List<String> whain = new ArrayList<>();
        List<String> wha = new ArrayList<>();
        List<String> whaout = new ArrayList<>();
        String path = "C:\\Users\\vlada\\IdeaProjects\\wchain\\src\\com\\company\\logs";
        File file = new File(path);
        Comparator<String> stringLengthComparator = (o1, o2) -> Integer.compare(o2.length(), o1.length());

        Scanner scanner = new Scanner(System.in);

        Scanner scannerfile = new Scanner(file);
        while(scannerfile.hasNextLine()){
            whain.add(scannerfile.nextLine());
        }

        whain.sort(stringLengthComparator);

        System.out.println(whain);

        int start = scanner.nextInt();
        System.out.println(start);

        for (String s : whain) {
            if (whain.get(start).contains(s)) {
                wha.add(s);
            }
        }

        for(int i = 0; i< wha.size();i++){
            if(wha.get(0).length() - wha.get(i).length() == i){
                whaout.add(wha.get(i));
            }
        }
        try {
            FileWriter myWriter = new FileWriter("wchaout.txt");

            myWriter.write(whaout + "\n" + "Counter: "+whaout.size());

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
