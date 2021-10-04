package week1;
import java.util.Scanner;
//semih burhan - getir
public class weeklySalaryCalculation {

    public static void main(String[] args){

        double standardWorkingHours = 40; //The weekly working hour standard is 40 hours per week.

        System.out.println("Please enter your base salary!"); //Base salary must be at least 1000 euros.
        Scanner scanner = new Scanner(System.in);
        double baseSalary = scanner.nextDouble();

        if (baseSalary>=1000) {
            System.out.println("How many hours did you work during the week?");
            double weeklyWorkingHours = scanner.nextDouble();

            System.out.println("How many hours did you work at the weekend?");
            double weekendWorkingHours = scanner.nextDouble();
            scanner.close();

            double unitWage = baseSalary / standardWorkingHours; // Base salary must be at least 1000 euros.
            System.out.println("Your hourly wage:" + unitWage);

            //double workingHours= weeklyWorkingHours - standardWorkingHours;
            double weekdaysWorkingHours = weeklyWorkingHours - weekendWorkingHours; //how many hours did the employee work during weekdays??
            double reducedWorkingHours = standardWorkingHours - weekdaysWorkingHours;

            if (weeklyWorkingHours >= 40) {
                double extraWageWeekdays = unitWage * (weekdaysWorkingHours - standardWorkingHours) * 1.5; //For every hour worked on weekdays over 40 hours, 1.5 times the hourly unit wage is paid.
                double extraWageWeekend = unitWage * weekendWorkingHours * 2; //For every hour worked on weekends over 40 hours(nonsense!!totally weekend has 48 hours!), 2 times the hourly unit wage is paid.
                if (weekendWorkingHours < 10) {
                    double salary = baseSalary + extraWageWeekdays + extraWageWeekend;
                    System.out.println("Your total salary is" + " " + salary);
                } else if (weekendWorkingHours >= 10) { //bonus is 500 euros if the employee has worked at least 40 hours during the week and more than 10 hours on the weekends.
                    double salary = baseSalary + extraWageWeekdays + extraWageWeekend + 500;
                    System.out.println("Congratulations! You earned 500 euros bonus! Your total salary is" + " " + salary);
                }
            }
            else if (weeklyWorkingHours < 40) {
                double noExtraWageWeekdays = 0;
                double reducedSalary = baseSalary - (reducedWorkingHours*unitWage);
                double extraWageWeekend = unitWage * weekendWorkingHours * 2; //For every hour worked on weekends over 40 hours(nonsense!!totally weekend has 48 hours!), 2 times the hourly unit wage is paid.
                if (weekendWorkingHours > 0 && weekendWorkingHours < 10) {
                    double salary = reducedSalary + noExtraWageWeekdays + extraWageWeekend;
                    System.out.println("Your total salary is" + " " + salary);
                }
                else if (weekendWorkingHours >= 10) {//bonus is 500 euros if the employee has worked at least 40 hours during the week and more than 10 hours on the weekends.
                    double salary = reducedSalary + noExtraWageWeekdays + extraWageWeekend + 500;
                    System.out.println("Congratulations! You earned 500 euros bonus! Your total salary is" + " " + salary);
                }
                else if (weekendWorkingHours == 0) {//If the employee has worked less than 40 hours, her/his salary should be reduced proportionally
                    System.out.println("Your total salary is" + " " + reducedSalary);
                }
            }
        }
        else if (baseSalary<0){
            System.out.println("Your base salary should not be negative!Please make sure, your base salary must be at least 1000 euros.");
        }
        else
            System.out.println("Your base salary is out of range! Please make sure, your base salary must be at least 1000 euros.");
    }
}