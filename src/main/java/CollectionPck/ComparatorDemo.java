package CollectionPck;

import java.util.Comparator;

public class ComparatorDemo implements Comparator{

    public int compare(Object o1, Object o2) {
            Employee e1 = (Employee) o1;
            Employee e2=(Employee) o2;

                if(e1.esalary>e2.esalary)
                     return -1;
                else if(e1.esalary<e2.esalary)
                     return 1;
                else return 0;
            }
        }

