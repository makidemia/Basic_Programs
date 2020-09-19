package PracticeCollection;

import CollectionPck.Employee;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<Student>();
        Student s = new Student("mk", 101, "PCM");
        //studentSet.add(new Student("pk", 101, "PCM"));
        //studentSet.add(new Student("mk", 101, "PCM"));
        //studentSet.add(new Student("mk", 101, "PCM"));

        Student s1=s;
        Student s2=s;
        studentSet.add(s);
        studentSet.add(s);
        studentSet.add(s);
        studentSet.add(s1);
        studentSet.add(s2);

        System.out.println(studentSet.size());
        System.out.println(studentSet);

    }

}
