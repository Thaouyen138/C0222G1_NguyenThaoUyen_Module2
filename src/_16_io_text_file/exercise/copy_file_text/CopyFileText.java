package _16_io_text_file.exercise.copy_file_text;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        File sourceFile =new File("src\\_16_io_text_file\\exercise\\copy_file_text\\SourceFile.txt");
        File targetFile =new File("src\\_16_io_text_file\\exercise\\copy_file_text\\TargetFile.txt");
        readFile(sourceFile);
        readFile(targetFile);
        try {
            BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
            String line="";
            while ((line=br.readLine())!=null){
                bw.write(line+"\n");
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  static void readFile(File file){
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

        } catch (FileNotFoundException e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
