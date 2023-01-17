package ObjectAdapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        Duck turkeyDuck = new TurkeyAdapter(turkey);
        testDuck(turkeyDuck);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
