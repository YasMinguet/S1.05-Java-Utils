package lvl1_Ex1;
import java.io.*;

//C:\Users\Kain\Documents\IT Academy Java\S1.05\src\lvl1_Ex1>java App.java

public class App {

	public static void main(String[] args) {
		File route=new File("C:/Users/Kain/Desktop/java_ser");
		System.out.println(route.getAbsolutePath());
		String[] archiveNames=route.list();
		for(int i=0;i<archiveNames.length;i++) {
			System.out.println(archiveNames[i]);
		}
		

	}

}
