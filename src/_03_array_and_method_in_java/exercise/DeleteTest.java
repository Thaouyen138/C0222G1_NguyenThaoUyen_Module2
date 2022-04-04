package _03_array_and_method_in_java.exercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] mang={1,2,3,4,5};
        System.out.println(Arrays.toString(mang));
        int input=Integer.parseInt(scanner.nextLine());
        for (int i=0;i<mang.length;i++){
            if (input==mang[i]){
               for (int k=i;k<mang.length-1;k++){
                   mang[k]=mang[k+1];
               }
                mang[mang.length-1]=0;
            }
        }
        System.out.println(Arrays.toString(mang));
    }
}
