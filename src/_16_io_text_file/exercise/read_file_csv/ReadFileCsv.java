package _16_io_text_file.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCsv {

    public static List<String[]> read(String path) {
        File file = new File(path);
        List<String[]> arrayList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                String[] arr = str.split(",");
                arrayList.add(arr);
            }
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        return arrayList;
    }

    public static void main(String[] args) {
        List<String[]> strings = read("src\\_16_io_text_file\\exercise\\read_file_csv\\ReadFille.csv");
        List<Country> countryList=new ArrayList<>();
        for (String[] item : strings) {
            countryList.add(new Country(Integer.parseInt(item[0]),item[1],item[2]));
        }
        for (Country item2:countryList
             ) {
            System.out.println(item2);
        }
    }
}
