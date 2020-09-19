package Programs;


import static Programs.Main.userRepo;

public class MapOfUser {

    public static void checkDuplicateEmailId(User user) {
        boolean duplicateValue = userRepo.containsValue(user.getEmail());
        if (duplicateValue == true) {
            System.out.println("email already present");
        }else {
            System.out.println(userRepo.containsValue(user.getEmail()));
        }
    }
}
