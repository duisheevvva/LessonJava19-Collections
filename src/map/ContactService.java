package map;

import java.util.Map;

public interface ContactService {
    void addContact(String name , String phoneNumber);
    String getContact(String name);
    void removeContact(String name);
    Map<String,String> getAllContacts();
}
