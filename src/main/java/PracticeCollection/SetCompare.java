package PracticeCollection;

import java.util.Comparator;

public class SetCompare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        if (o1.sRollno>o2.sRollno)
            return -1;
        else if (o1.sRollno<o2.sRollno)
            return 1;
        else return 0;

      /*  if (o1.sName.compareTo(o2.sName) < 0)
            return -1;
        else if (o1.sName.compareTo(o2.sName)>0)
                return 1;
        else
        return 0;
*/

    }

}
