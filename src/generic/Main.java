package generic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        GeneralService<User> userService = new UserServiceImpl();
//        userService.save(new User("diamond","d@gmail.com","Ayana","Urmatova",18));
//        System.out.println(userService.getAll());
////        System.out.println(userService.getByValue("diamond"));
//         userService.update("diamond",new User("goodBoy","test@gmail.com","test","test",18));
//        System.out.println("Update" + userService.getAll());
//        userService.delete("goodBoy");
//        System.out.println("Delete" + userService.getAll());


        ArrayList<String> list = new ArrayList<>();
        list.add("Ayana");
        list.add("Nurperi");
        wildcard(list);
        ArrayList<?> list1 = new ArrayList<>();



    }

    public static void wildcard(ArrayList<?> list) {
        System.out.println(list);
    }
}
