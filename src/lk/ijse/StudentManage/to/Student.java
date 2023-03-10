package lk.ijse.StudentManage.to;

public class Student {
    private String studentID;
    private String studentName;
    private String email;
    private String contact;
    private String address;
    private String nic;

    public Student() {

    }

    public Student(String studentID, String studentName, String email, String contact, String address, String nic) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.nic = nic;
    }

    public Student(String studentID) {
        this.studentID = studentID;
    }


    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
}
