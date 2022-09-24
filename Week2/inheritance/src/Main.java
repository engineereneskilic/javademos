public class Main {
    public static void main(String[] args) {
            Customer customer = new Customer();
            Employee employee = new Employee();


            EmployeeManager employeeManager = new EmployeeManager();
            employeeManager.AyinElemani();
            employeeManager.List();

            CustomerManager customerManager = new CustomerManager();
            customerManager.Add();
            customerManager.List();
    }
}
