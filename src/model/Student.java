package model;

public class Student {
    private String name;
    private Integer age;
    private String sex;
    private Integer stuNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }


    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getStuNum() {
        return stuNum;
    }

    public void setStuNum(Integer stuNum) {
        this.stuNum = stuNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", stuNum=" + stuNum +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("曹桂凤");
        student.setAge(22);
        student.setSex("女");
        student.setStuNum(1);
        System.out.println(student.toString());
    }
}
