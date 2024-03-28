package demoProject;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		List<project> li=new ArrayList<>(); 
		li.add(new project(1,"Python", "Chennai"));
		li.add(new project(2,"Java", "Noida"));
		li.add(new project(3,"Java", "Bangalore"));
		li.add(new project(4,"Dotnet", "Chennai"));
		li.add(new project(5,"SAP", "Chennai"));
		li.add(new project(6,"Java", "Noida"));
		li.add(new project(7,"Python", "Chennai"));
		li.add(new project(8,"Dotnet", "Bangalore"));
		li.add(new project(9,"Python", "Chennai"));
		li.add(new project(10,"Java", "Noida"));
		
		li.stream().filter(p->p.getprloc().equals("Noida")).forEach(System.out::println);

	}

}
