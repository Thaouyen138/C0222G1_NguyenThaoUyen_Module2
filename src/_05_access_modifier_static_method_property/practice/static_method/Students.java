package _05_access_modifier_static_method_property.practice.static_method;

public class Students {
    private int roolNo;
    private String name;
    private static String college="DHHN";

    public Students() {
    }

    public Students(int roolNo, String name) {
        this.roolNo = roolNo;
        this.name = name;
    }
   void chage(){
        college="codegym";
    }
     void display(){
        System.out.println(roolNo+ " "+ name+ " "+ college);
    }
}
