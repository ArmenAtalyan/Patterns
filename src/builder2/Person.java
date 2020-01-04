package builder2;

public class Person {
    private String name;
    private int age;
    private int salary;
    private String address;

    public Person(PersonBuilder builder){
        name = builder.name;
        age = builder.age;
        salary = builder.salary;
        address = builder.address;
    }

    public void print(){
        System.out.println(name +  "\n" + age + "\n" + salary + "\n" + address);
    }

    public static class PersonBuilder{

        private String name;
        private int age;
        private int salary;
        private String address;

        public PersonBuilder(String address) {
            this.address = address;
        }

        public PersonBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder buildAAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder buildSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public PersonBuilder buildAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            Person p = new Person(this);
            return p;
        }
    }
}



