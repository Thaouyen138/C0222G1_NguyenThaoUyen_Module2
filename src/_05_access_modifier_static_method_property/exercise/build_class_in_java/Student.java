package _05_access_modifier_static_method_property.exercise.build_class_in_java;

public class Student {
    private String name="John";
    private String classes="C02";

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}