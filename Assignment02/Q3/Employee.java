package sunbeam.Q3;

import java.util.Arrays;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    
    public static void BubbleSort(Employee arr[], int N) {
        int passes = 0, comps = 0;
        for (int i = 0; i < N - 1; i++) {
            int flag = 0;
            for (int j = 0; j < N - i - 1; j++) {
                comps++;
                if (arr[j].salary > arr[j + 1].salary) {
                    // Swap both elements
                    Employee temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            passes++;
            if (flag == 0)
                break;
        }
        System.out.println("No of passes: " + passes);
        System.out.println("No of comps: " + comps);
    }

    public static void main(String[] args) {
        Employee e[] = new Employee[5];
        e[0] = new Employee(1, "Anil", 15000);
        e[1] = new Employee(2, "Preeti", 80000);
        e[2] = new Employee(3, "Neha", 75000);
        e[3] = new Employee(4, "Kavya", 20000);
        e[4] = new Employee(5, "Nitin", 90000);

        System.out.println("Array before sorting by salary: " + Arrays.toString(e));
        BubbleSort(e, e.length);
        System.out.println("Array after sorting by salary: " + Arrays.toString(e));
    }
}
