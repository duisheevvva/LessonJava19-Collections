package generic;

import java.util.List;

public class StudentServiceImpl implements GeneralService<Student>{
    @Override
    public void save(Student student) {

    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public <E> Student getByValue(E value) {
        return null;
    }

    @Override
    public <E> void update(E value, Student student) {

    }

    @Override
    public <E> void delete(E value) {

    }
}
