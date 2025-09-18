package generic;

import java.util.List;

public interface GeneralService<T extends Person> {

    void save(T t);
    List<T> getAll();
    <E> T getByValue(E value);
    <E> void update(E value , T t);
    <E> void delete(E value);

}
