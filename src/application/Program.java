package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.Worker;
import entities_enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter departament s name:");
		String departamentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.println("Name:");
		String WorkerName = sc.nextLine();
		System.out.println("Level:");
		String WorkerLeve= sc.nextLine();
		System.out.println("Base Salary:");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(departamentName, WorkerLeve.valueOf(WorkerLevel), baseSalary, new Departament(departamentName));
		
		sc.close();
	}

}
