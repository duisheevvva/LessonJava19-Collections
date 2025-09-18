package map;

public class MainContact {
    public static void main(String[] args) {
        ContactService contactService = new ContactServiceImpl();
        contactService.addContact("Saikal","+996708665544");
        contactService.addContact("Ayana","+996506778899");
        contactService.addContact("Ernis","+996304556677");
        contactService.addContact("Nurperi","+996304556677");

        System.out.println(contactService.getAllContacts());
//        System.out.println(contactService.getContact("Sanjar"));
        contactService.removeContact("Ernis");
        System.out.println(contactService.getAllContacts());























    }
}
