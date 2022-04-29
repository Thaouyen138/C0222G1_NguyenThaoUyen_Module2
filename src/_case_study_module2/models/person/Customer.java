package _case_study_module2.models.person;

import _case_study_module2.models.person.Person;

public class Customer extends Person {
    private String idCustomer;
    private String typeCustomer;
    private String address;

    public Customer() {
    }
    public Customer(String name, String dateOfBirth, String gender, String identity, String phone, String email, String idCustomer, String typeCustomer, String address) {
        super(name, dateOfBirth, gender, identity, phone, email);
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                "idCustomer='" + idCustomer + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
