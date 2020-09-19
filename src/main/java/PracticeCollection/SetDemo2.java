package PracticeCollection;

import java.util.*;

public class SetDemo2 {
    public static void main(String[] args) {

        Student s=new Student("mk",101,"PCM");
        Student s1=new Student("rk",102,"PCM");
        Student s2=new Student("pk",103,"PCM");
        Student s3=new Student("kk",104,"PCM");

        TreeSet<Student> set=new TreeSet<Student>();
        set.add(s);
        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //SetCompare sc=new SetCompare();
        List<Student> al=new ArrayList<Student>();
        al.addAll(set);
        Collections.sort(al);
        System.out.println(al);

    }

}
