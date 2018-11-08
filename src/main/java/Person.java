public class Person {
    String name;
    Person friend;

    public Person(Person friend, String name) {
        this.friend = friend;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person getFriend() {
        return friend;
    }
}
