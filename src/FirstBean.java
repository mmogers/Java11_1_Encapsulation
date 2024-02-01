/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 8: Applying Encapsulation
Topic: Encapsulation in Java
Sub-Topic: Java Bean
*/

public class FirstBean {

    private String name;
    private int age;

    private boolean isFirst;

    private int myOwnVariable;

    public int getFieldAlias() {
        return myOwnVariable;
    }

    public void setFieldAlias(int fieldAlias) {
        this.myOwnVariable = fieldAlias;
    }



    public FirstBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public void setFirst(boolean first) {
        isFirst = first;
    }

    public static void main(String[] args) {
    }

}