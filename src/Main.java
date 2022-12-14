public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {

        /*Задача 1
        Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся в неструктурированном формате.
        Бухгалтерия попросила написать программу, в которой можно работать с Ф. И. О. сотрудников.
        Напишите четыре строки:
        С именем firstName — для хранения имени.
        С именем middleName — для хранения отчества.
        С именем lastName — для хранения фамилии.
        С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        Выведите в консоль фразу: «ФИО сотрудника — …».
        В качестве данных для задачи используйте "Ivanov Ivan Ivanovich".*/

        System.out.println("\nЗадача_1:");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника - " + fullName + ".");
    }

    public static void task2() {

        /*Задача 2
    Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников, полностью написанные
    заглавными буквами (верхним регистром).
    Напишите программу, которая изменит написание Ф. И. О. сотрудника с "Ivanov Ivan Ivanovich" на полностью заглавные
    буквы.
    В качестве строки с исходными данными используйте строку fullName.
    Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для заполнения отчета — …"*/

        System.out.println("\nЗадача_2:");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase() + ".");

    }

    public static void task3() {

        /*Задача 3
        Система, в которой мы работаем, не принимает символ «ё». Напишите программу, которая заменяет символ «ё» на символ «е».
        В качестве исходных данных используйте строку fullName и данные в ней — "Иванов Семён Семёнович".
        Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».*/

        System.out.println("\nЗадача_3:");

        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;

        fullName = fullName.replace("ё", "е");

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName + ".");
    }
}