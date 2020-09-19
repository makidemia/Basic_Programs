package Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static HashMap<Integer, User> userRepo = new HashMap<Integer, User>();


    public static String add(User user) {
        int key = userRepo.size() + 1;
        userRepo.put(key, user);
        return Integer.toString(key);
    }

    public static void main(String[] args) throws Exception {
        userRepo.put(1, new User("fname", "lname", "mk.oms@gmail.com"));
        userRepo.put(2, new User("pnmae", "kname", "pk.oms@gmail.com"));
        userRepo.put(3, new User("fname", "lname", "mk.oms@gmail.com"));

        User user = new User("fname", "lname", "mk.oms@gmail.com");
//        MapOfUser.checkDuplicateEmailId(user);
       /* Set<Map.Entry<Integer,User>> set= userRepo.entrySet();

        Iterator it =set.iterator();
        while (it.hasNext()){
            System.out.println(set.);

        }*/
      /*  Set<Map.Entry<Integer, User>> set = userRepo.entrySet();

        Iterator<Map.Entry<Integer, User>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry e = itr.next();
            System.out.println(e.getValue() + " ----" + (user.email));
            System.out.println(e.getValue());//no need to typecast
        }

        for (Map.Entry<Integer, User> entry : userRepo.entrySet()
        ) {entry.getValue().getEmail();


        }*/
        if (user.getFirstName() == null || user.getLastName() == null || user.getEmail() == null) {
            System.out.println("nothing is null");
                throw new Exception("null value");

        }

        }
}
