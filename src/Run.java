public class Run {
    void main () {
        Person Vasia = new Person("Вася", 5);
        Person Peter = new Person("Петя",10);
        Vasia.countDifference(Peter);
    }

    public static int countDifferenceBetweenPersons(Person p1, Person p2) {
        return p1.getApples() - p2.getApples();
    }
}
