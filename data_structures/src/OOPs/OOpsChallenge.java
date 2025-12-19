package OOPs;

import java.util.ArrayList;
import java.util.List;

interface Taxable{
    double calculateTax(double amount);
    public static void add(){
        System.out.println("This is for the testing ");
    }
}
abstract class Worker {
    private int workerId;
    private String workerName;
    static int sum;
    static {
        sum = 3;
    }
    static int workerCount = 0;

    public Worker(int workerId, String workerName) {
        this.workerId = workerId;
        this.workerName = workerName;
        workerCount++;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public abstract double payCalculate();
    public void showProfile(){
        System.out.println("ID : "+workerId + " NAME : "+workerName);
    }
}
class FullTimeEmployee extends Worker implements Taxable{
    double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) throws Exception {
        this.monthlySalary = monthlySalary;
    }

    public FullTimeEmployee(int workerId, String workerName, double monthlySalary)   {
        super(workerId, workerName);
        if (monthlySalary <= 0){
            throw new IllegalArgumentException("Salary can not be negative for "+workerName);
        }
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double payCalculate() {
        return monthlySalary;
    }
    @Override
    public double calculateTax(double monthlySalary) {
        return (monthlySalary * 20) / 100;
    }
}
class FreelancerEmployee extends Worker{
    double hourRate;
    int hours;

    public FreelancerEmployee(int workerId, String workerName,double hourRate, int hours) {
        super(workerId,workerName);
        this.hourRate = hourRate;
        if (hours <= 0) {
            throw new IllegalArgumentException("Error: Hours must be positive for " + workerName);
        }
        this.hours = hours;
    }

    @Override
    public double payCalculate() {
        return hourRate * hours;
    }
}
public class OOpsChallenge {
    public static void addWorkerFreeLancerSafe(List<Worker> workers,int workerId,String workerName,double hourRate,int hours){
        try{
            Worker w = new FreelancerEmployee(workerId,workerName,hourRate,hours);
            workers.add(w);
            System.out.println("Success: Added " + workerName);
        }
        catch (IllegalArgumentException e){
            System.out.println("Failed to add " + workerName + ": " + e.getMessage());
        }
    }
    public static void addWorkerFullTimeSafe(List<Worker> workers,int workerId,String workerName,double monthlySalary){
        try{
            Worker w1 = new FullTimeEmployee(workerId,workerName,monthlySalary);
            workers.add(w1);
            System.out.println("Success: Added " + workerName);
        }
        catch (IllegalArgumentException e){
            System.out.println("Failed to add " + workerName + ": " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Worker.sum = 4;
         System.out.println( Worker.sum);
        List<Worker> workers = new ArrayList<>();

        addWorkerFreeLancerSafe(workers,1, "Pravin", 20000, 3);
        addWorkerFullTimeSafe(workers,2, "Amol", 100000);
        addWorkerFullTimeSafe(workers,3, "Ram", 1110);
        addWorkerFreeLancerSafe(workers, 4, "Sham", 20000, 3);
        System.out.println("--- Attempting to add Invalid Worker ---");
        addWorkerFullTimeSafe(workers,5, "Ramesh", 0);
        addWorkerFreeLancerSafe(workers,7, "Shamal", 100, 0);
        System.out.println("\n--- Processing Payroll ---");

        for (Worker worker: workers){
            System.out.println("-----------------------------");
            worker.showProfile();
            double pay = worker.payCalculate();
            System.out.println("Pay : " + pay);

            if (worker instanceof Taxable){
                Taxable t = (Taxable) worker;
                double tax = t.calculateTax(pay);
                System.out.println("Tax Deducted: " + tax);
                System.out.println("Net Pay: " + (pay - tax));
            }
            else {
                System.out.println("Tax: 0.0 (Freelancer)");
            }
        }
        System.out.println("The valid workers are "+workers.size());


        /*
        try {
            Worker w1 = new FreelancerEmployee(1, "Pravin", 20000, 3);
            Worker w2 = new FullTimeEmployee(2, "Amol", 100000);
            Worker w4 = new FullTimeEmployee(3, "Ram", 02123);
            Worker w3 = new FreelancerEmployee(4, "Sham", 100, 10);

            Worker[] workers = {w1, w2, w3, w4};
            for (Worker worker : workers) {
                System.out.println("-----------------------------");
                System.out.println("                                |");
                System.out.println("                                |");
                try{
                    worker.showProfile();

                    double pay = worker.payCalculate();
                    System.out.println("Pay : " + pay);

                    if (worker instanceof Taxable) {
                        Taxable t = (Taxable) worker;
                        double payTax = t.calculateTax(pay);
                        System.out.println("Tax Deducted : " + payTax);
                        System.out.println("Pay next : " + (pay - payTax));

                    } else {
                        System.out.println("Tax: 0.0 (Freelancer)");
                    }
                }
                catch (Exception e){
                    System.out.println("Payment failed :"+e.getMessage());
                }

            }

        }
        catch (Exception e){
            System.out.println("Could not create a worker : "+e.getMessage());
        }

        System.out.println("-----------------");
        System.out.println("Total Workers: " + Worker.workerCount);

         */
    }
}


        /*
        w1.showProfile();
        System.out.println("The salary of "+w1.getWorkerName()+" is "+ w1.payCalculate());
        w2.showProfile();
        w2.payCalculate();
        if (w1 instanceof FreelancerEmployee){
            FreelancerEmployee f = (FreelancerEmployee) w1;
        }
        else {
            System.out.println("Worker can not fetch");
        }
        if ( w2 instanceof FullTimeEmployee){
            FullTimeEmployee ft = (FullTimeEmployee) w2;
            System.out.println("The salary of "+ft.getWorkerName()+" is "+ft.getMonthlySalary());
            System.out.println("The salary of "+ft.getWorkerName()+" after the tax is "+((FullTimeEmployee) w2).calculateTax(ft.getMonthlySalary()));
        }
        else {
            System.out.println("Worker can not fetch");
        }

        System.out.println("No of workers "+Worker.workerCount);


         */

        // cleaner version


