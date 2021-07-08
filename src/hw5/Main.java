package hw5;

public class Main {

    public static void main(String[] args) {

        Person[] persArray = {
                new Person("Иванов Иван Иванович", "Инженер-конструктор", "ivanov@mail.ru", "89231231232", 50000f, 43),
                new Person("Петров Петр Петрович", "Техник-конструктор", "petrov@mail.ru", "89064567623", 50000f, 45),
                new Person("Сидоров Сидор Сидорович", "Дизайнер", "sidorov@mail.ru", "89118797634", 45000f, 34),
                new Person("Андреев Андрей Андреевич", "Технолог", "andreev@mail.ru", "89222345678", 45000f, 42),
                new Person("Борисов Борис Борисович", "Сметчик", "borisov@mail.ru", "89267655676", 45000f, 37)
        };
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].info();
            }
        }
    }


}
