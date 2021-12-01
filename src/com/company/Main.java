package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        List<String> whain = new ArrayList<>();
        List<String> whaout = new ArrayList<>();
        String path = "C:\\Users\\vlada\\IdeaProjects\\wchain\\src\\com\\company\\logs";
        File file = new File(path);
        Scanner scannerfile = new Scanner(file);

        while (scannerfile.hasNextLine()) {
            whain.add(scannerfile.nextLine());
        }

        Comparator<String> stringLengthComparator = (o1, o2) -> Integer.compare(o2.length(), o1.length());

        whain.sort(stringLengthComparator);

        System.out.println(whain);
        int counter = 0 ;

        //       int start = scanner.nextInt();
        //       System.out.println(start);

//Work:2
//        for (String s : whain) {
//            if (whain.get(start).contains(s)) {
//                wha.add(s);
//            }
//        }
//
//        for(int i = 0; i< wha.size();i++){
//            if(wha.get(0).length() - wha.get(i).length() == i){
//                whaout.add(wha.get(i));
//            }
//        }

        String start = whain.get(0);
        int k = 0;
        String temp = whain.get(k);

        for(int i = 0; i< whain.size();i++){
            if(start.contains(temp)){
                whaout.add(temp);
                start = whain.get(k);
                if(i == whain.size()-1){
                    break;
                }
            }
                temp = whain.get(++k);
        }

        for (int i = 0;i<whaout.size();i++) {
            if(whaout.get(0).length() - whaout.get(i).length() == i){
                counter++;
                System.out.println(whaout.get(i));
            }
        }
        System.out.println(counter);

        try {
            FileWriter myWriter = new FileWriter("wchaout.txt");

            myWriter.write("Counter: "+counter);

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
