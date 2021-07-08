package hw5;

public class Person {

    private String name;
    private String position;
    private String email;
    private String phone;
    private Float salary;
    private int age;

    public Person(String name, String position, String email, String phone, Float salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + name + "; Должность: " + position + "; email: " + email);
        System.out.println("  Телефон: " + phone + "; Зарплата: " + salary + "; Возраст: " + age);
    }

    public int getAge() {
        return age;
    }


}
