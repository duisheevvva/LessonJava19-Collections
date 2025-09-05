package lessonTasks;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList();
        // add method
        arrayList.add("Saikal");
        arrayList.add("Aybiike");
        arrayList.add("Sultan");
        arrayList.add(2,"Asgadbek");

        // get method
        System.out.println(arrayList.get(3));
        // size
        System.out.println(arrayList.size());
        // set
        arrayList.set(3,"Bektursun");
        //is Empty
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList);
        // remove
        arrayList.remove(2);

        System.out.println(arrayList);

        System.out.println(arrayList.contains("Anara"));

        arrayList.clear();
        System.out.println(arrayList);

        arrayList.add("Saikal");
        arrayList.add("Aybiike");
        arrayList.add("Sultan");

        System.out.println(arrayList);


    }
}