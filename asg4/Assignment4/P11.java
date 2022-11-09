import java.io.*;

class Employee
{
    int emp_id;
    String emp_name;
    double basic_salary;
    double gross_salary;

    Employee(String name, int id, double basic)
    {
        emp_name = name;
        emp_id = id;
        basic_salary = basic;
    }

    void calculate()
    {
        int tax = 5;//you can put your own value here (<100)
        double deduction;
        deduction = tax/100.0*basic_salary;
        gross_salary = basic_salary - deduction;
        System.out.println("Gross Salary of Employee is " + gross_salary);
    }
}

class P11
{
    public static void main(String args[])throws IOException
    {
        
        String n = new String();
        int id;
        double sal;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee name: ");
        n = br.readLine();
        System.out.print("Enter Employee ID: ");
        id = Integer.parseInt(br.readLine());
        System.out.print("Enter Basic Salary: ");
        sal = Double.parseDouble(br.readLine());
        Employee em = new Employee(n, id, sal);
        em.calculate();
    }
}