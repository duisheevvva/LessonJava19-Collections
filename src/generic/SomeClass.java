package generic;

public class SomeClass <T,E>{
    private T name;
    private E age;


    public SomeClass() {
    }

    public SomeClass(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "name=" + name +
                '}';
    }
}
