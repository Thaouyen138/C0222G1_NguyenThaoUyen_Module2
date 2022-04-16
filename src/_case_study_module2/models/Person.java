package _case_study_module2.models;

public abstract class Person {
    //Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email,
    private String name;
    private String dateOfBirth;
    private String gender;
    private String identity;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(String name, String dateOfBirth, String gender, String identity, String phone, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identity = identity;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", identity='" + identity + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email +'\''+",";
    }
}
