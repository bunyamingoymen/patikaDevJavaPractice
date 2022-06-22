public class Main {

    public static void main(String[] args) {
        Employee newEmployee = new Employee("Kemal",2000.0,45,1985);
        newEmployee.tax();
        newEmployee.bonus();
        newEmployee.raiseSalary();
        System.out.println(newEmployee.toString());;
    }
}
