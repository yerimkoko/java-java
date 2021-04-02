package InfLearn.practice;

public class practiceUserVo {
    private int id;
    private String name;
    private String major;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    private int studentId;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override // 자동으로 생성해준다. =>
    public String toString() {
        return "practiceItemVo{" +
                "id=" + id +
                ", name=" + name +
                ", major=" + major +
                ", studentId=" + studentId +
                '}';
    }
}
