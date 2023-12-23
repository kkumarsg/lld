package generics.basics;

public class Friend<T, U>{

    T person1;
    T person2;
    U relation;

    public Friend(T person1, T person2, U relation) {
        this.person1 = person1;
        this.person2 = person2;
        this.relation = relation;
    }
}
