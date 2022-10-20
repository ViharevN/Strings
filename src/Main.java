public class Main {
    public static void main(String[] args) {
        //строки домашнее задание
        //задание 1

        String firstName = new String("Ivan");
        String middleName = new String("Ivanovich");
        String lastName = new String("Ivanov");
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — "+ fullName);

        //задание 2

        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullNameUpperCase);

        //задание 3

        fullName = "Иванов Семён Семёнович";
        String fullNameReplace = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullNameReplace);

    }
}