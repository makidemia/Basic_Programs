package PracticeCollection;

public class Student implements Comparable {

    String sName;
    int sRollno;
    String subject;

    public Student(String sName,int sRollno,String subject){
        this.sName=sName;
        this.sRollno=sRollno;
        this.subject=subject;
    }
    public Student(){
    }


    @Override
    public String toString() {
        return sName+" "+sRollno+" "+subject;
    }

    @Override
    public int hashCode() {
        return sRollno;
    }

    public int compareTo(Object o) {
        Student student =(Student)o;
        System.out.println("this"+this.sRollno);
        System.out.println("student"+student.sRollno);
        return this.sRollno-student.sRollno;

    }
}
