package lvl1_Ex2;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

//C:\Users\Kain\Documents\IT Academy Java\S1.05\src\lvl1_Ex2>java app.java

public class App {

	public static void main(String[] args) {
		File route = new File("C:/Users/Kain/Desktop/java_ser");
		File[] archiveNames = route.listFiles();
		checkDirectory(archiveNames);

	}

	static void checkDirectory(File[] listF) {
		for (int i = 0; i < listF.length; i++) {
			if (listF[i].isDirectory()) {
				System.out.println(listF[i].getName() + "(D)." + checkDateModification(listF[i]));
				File[] list = listF[i].listFiles();
				checkDirectory(list);
			} else {
				System.out.println(listF[i].getName() + " (F)." + checkDateModification(listF[i]));
			}
		}

	}

	static String checkDateModification(File f) {
		long lastModified = f.lastModified();

		String pattern = "yyyy-MM-dd hh:mm aa";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		Date lastModifiedDate = new Date(lastModified);

		return simpleDateFormat.format(lastModifiedDate);
	}

}
