public class Main {
    /*
    * - Introduction
    * ========================================
    * Before I start you should now that java always passes data by its value.
    * */
    public static void main(String[] args) {
        // Primitive data type
        int sum = 10; // -> added to the stack (var with its value)
        // sum value is 10

        // Reference data type
        Person person = new Person("Mohamed", 21); // -> (person = ref(0XF0001) in the stack) and the object in the heap
        // person value is ref(0XF0001) not new Person("Mohamed", 21)

        System.out.println("Before doing any mutations: ");
        System.out.println("sum = " + sum);
        System.out.println(person);

        System.out.println();

        // increaseSum(10);
        increaseSum(sum);

        // increasePersonAge(ref(0XF0001));
        increasePersonAge(person);

        System.out.println("After doing mutations: ");
        System.out.println("sum = " + sum);
        System.out.println(person);
    }

    public static void increaseSum(int sum){
        ++sum;
    }

    /*
    *
    * */
    public static void increasePersonAge(Person person){
        // accessing object property by its reference ref(0XF0001)
        ++person.age;
    }
}