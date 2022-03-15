package lvl1_Ex5;

import java.io.*;

import java.util.ArrayList;

//C:\Users\Kain\Documents\IT Academy Java\S1.05\src\lvl1_Ex5>java app.java

public class App {

	public static void main(String[] args) {
		ArrayList<Empleado> personal = new ArrayList<Empleado>();
		personal.add(new Empleado("Ana"));
		personal.add(new Empleado("Oscar"));
		personal.add(new Empleado("Mireia"));
		personal.add(new Empleado("Marta"));

		try {
			ObjectOutputStream writting = new ObjectOutputStream(
					new FileOutputStream("C:/Users/Kain/Desktop/java_ser/data.ser"));
			writting.writeObject(personal);
			writting.close();

			ObjectInputStream recovery = new ObjectInputStream(
					new FileInputStream("C:/Users/Kain/Desktop/java_ser/data.ser"));
			ArrayList<Empleado> personalRecovery = (ArrayList<Empleado>) recovery.readObject();
			recovery.close();

			for (Empleado e : personalRecovery) {
				System.out.println(e);
			}

		} catch (Exception e) {

		}
	}

}
