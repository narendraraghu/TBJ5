import com.opencsv.CSVWriter;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CompareCSVNew {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        String file1 = "/Users/narendra/IdeaProjects/TBJ5/src/main/java/samplecsv1.csv";
        String file2 = "/Users/narendra/IdeaProjects/TBJ5/src/main/java/samplecsv2.csv";
        String LineOfFirstFile;
        String LineOfSecondFile;
        BufferedReader br1 = new BufferedReader(new FileReader(file1));
        BufferedReader br2 = new BufferedReader(new FileReader(file2));
        Map<String, String> s = new HashMap<>();
        while ((LineOfFirstFile = br1.readLine()) != null && (LineOfSecondFile = br2.readLine()) != null) {
            s.put(LineOfFirstFile.substring(0, LineOfFirstFile.indexOf(',')), LineOfFirstFile);

            s.put(LineOfSecondFile.substring(0, LineOfSecondFile.indexOf(',')), LineOfSecondFile);

            String[] columnsInFirstFile = LineOfFirstFile.split(",");
            String[] columnsInSecondFile = LineOfSecondFile.split(",");

            if (Arrays.equals(columnsInFirstFile, columnsInSecondFile)) {
                {
                    System.out.println("Both arrays are equal " + Arrays.stream(columnsInFirstFile).toList() + " = " + Arrays.stream(columnsInSecondFile).toList());
                }
            } else {
                //here you have to call those 3 methods according to your business logic
                insertRecordInThirdCSV(columnsInFirstFile, columnsInSecondFile);
                System.out.println("Both arrays are not equal " + Arrays.stream(columnsInFirstFile).toList() + " = " + Arrays.stream(columnsInSecondFile).toList());
            }
        }

    }

    private static void insertRecordInThirdCSV(String[] columnsInFirstFile, String[] columnsInSecondFile) throws IOException {
        String file = "/Users/narendra/IdeaProjects/TBJ5/src/main/java/samplecsv3.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(file));
        writer.writeNext(columnsInSecondFile);
        //Flushing data from writer to file
        writer.flush();
        System.out.println("Data entered");
    }
}