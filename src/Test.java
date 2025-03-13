

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Person[] people = {
                new Person("John", 25),
                new Person("Jane", 30),
                new Person("Bob", 20)
        };

        Arrays.sort(people);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}



