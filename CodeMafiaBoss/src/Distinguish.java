import java.io.File;
import java.io.FileNotFoundException;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;



public class Distinguish {
    public static void distinguish(String FileDirectory) throws FileNotFoundException {

        File file=new File(FileDirectory);
        Scanner scan=new Scanner(file);
        List<String> words=new ArrayList<>();
        int count=0;
        while(scan.hasNextLine()){
            if (count==0){
                count++;
                scan.nextLine();
                continue;
            }

            words.add(scan.nextLine());
        }

//        System.out.println(words);
        //loop for the lists length
        //each time check count how many times item repeats
        int countRegulator=0;
        int accumulator=0;
        //capture each word
        List<String> distinctWords=words.stream().distinct().collect(Collectors.toList());
        List<String> doneWords=new ArrayList<>();
        int uniquesCount = distinctWords.toArray().length;



        System.out.println(uniquesCount);
        while (countRegulator<distinctWords.toArray().length){

            int controller=0;

            while(controller<words.toArray().length){

                if(Objects.equals(words.get(countRegulator), words.get(controller))){
                    accumulator++;
                }
                controller++;
            }
            controller=0;
            System.out.print(accumulator+"  ");
            accumulator=0;
            countRegulator++;
        }
    }
}
