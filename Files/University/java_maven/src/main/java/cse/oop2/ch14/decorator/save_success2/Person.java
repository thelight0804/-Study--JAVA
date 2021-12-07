package cse.oop2.ch14.decorator.save_success2;

public class Person implements java.io.Serializable{
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {  return name; }

    public String getId() {
        return id;
    }
}
