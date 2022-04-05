package _05_access_modifier_static_method_property.practice.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Students students1=new Students(1,"uyen1");
        Students students2=new Students(2,"uyen2");
        Students students3=new Students(3,"uyen3");
        students1.chage();
        students1.display();
        students2.display();
        students3.display();
    }
}
