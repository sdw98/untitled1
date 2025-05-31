public class Main {
    public static void main(String[] args) {
        double salary = 55000.75;

        int bonus = 5000;

        int totalsalary = (int)salary + bonus;      //캐스팅(명시적 현변환)

        System.out.println("My Salary: "+ totalsalary);

        String a = "Hello";

        System.out.println(a.toUpperCase());

    }
}