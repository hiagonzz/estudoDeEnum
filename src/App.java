import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entites.Departament;
import entites.HourContrat;
import entites.Worker;
import enums.WorkerLevel;

public class App {

     public static void  main(String[] args) throws ParseException{
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");



      System.out.print("Enter departament' s name : "); 
      String  derpartamentName = sc.nextLine();
      System.out.println("Enter worker data: ");
      System.out.print("Name: ");
      String workerName = sc.nextLine();
      System.out.println("Level:");
      String workerLevel = sc.nextLine();
      System.out.println( "Base Salary:");
      double baseSalary = sc.nextDouble();

      Worker worker = new  Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(derpartamentName));


      System.out.println("How many contraints to this worker?");
      int n = sc.nextInt();

      for(int i=1; i <=n; i++){
         System.out.println("Enter contract #" + i + " data: ");
         System.out.print("Date (DD/MM/YYYY)");
         Date contractDate = sdf.parse(sc.next()); 
         System.out.print("Value por hora: ");
         double valuePorhour = sc.nextDouble();
         System.out.println("Durantion (hours): ");
         int hours = sc.nextInt();
         HourContrat contract = new HourContrat(contractDate, valuePorhour, hours);
         worker.addContract(contract);
      }

     
      System.out.println("enter month and year to calculate income (MM/YYYY): ");
      String monthAndYear = sc.next();
      int month = Integer.parseInt (monthAndYear.substring(0,2));
      int year = Integer.parseInt(monthAndYear.substring(3)); 
      
      System.out.println("Name: " + worker.getName());
      System.out.println("Departament: " + worker.getDepartament().getName());
      System.out.println("income for " + monthAndYear + ":" + String.format("%.2f", worker.income(year, month)));




      sc.close();
     }
}