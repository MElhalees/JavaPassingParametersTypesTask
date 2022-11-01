class Person {
    public String name;
    public int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person(\"" + this.name + "\", " + this.age + ")";
    }
}