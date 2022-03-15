package lvl1_Ex5;
import java.io.*;

public class Empleado implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private double salary;
	
	public Empleado (String name){
		this.name=name;
		salary=1500;
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

	public String toString() {
		return "El empleado/a "+name+", tiene un salario de "+salary+"€.";
	}
}
