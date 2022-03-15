package lvl1_Ex4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//C:\Users\Kain\Documents\IT Academy Java\S1.05\src\lvl1_Ex4>java app.java

public class App {

	public static void main(String[] args) {
		File route = new File("C:/Users/Kain/Desktop/java_ser");
		File[] archiveNames = route.listFiles();
		ArrayList<String> results = new ArrayList<String>();
		checkDirectory(archiveNames, results);
		writting(results, route.getAbsolutePath());

	}

	static void checkDirectory(File[] listF, ArrayList<String> result) {
		for (int i = 0; i < listF.length; i++) {
			if (listF[i].isDirectory()) {
				result.add(listF[i].getName() + "(D)." + checkDateModification(listF[i]) + "\n");
				File[] list = listF[i].listFiles();
				checkDirectory(list, result);
			} else {
				result.add(listF[i].getName() + " (F)." + checkDateModification(listF[i]) + "\n");
				reading(listF[i]);
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

	static void writting(ArrayList<String> resultados, String ruta) {
		try {
			FileWriter writeArchive = new FileWriter(ruta + "/resultado.txt");
			for (int i = 0; i < resultados.size(); i++) {
				writeArchive.write(resultados.get(i));
			}
			writeArchive.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static void reading(File text) {
		try {
			FileReader readArchive = new FileReader(text.getAbsolutePath());
			int c = 0;
			while (c != -1) {
				c = readArchive.read();
				char ch = (char) c;
				System.out.print(ch);
			}
			System.out.println("");
			readArchive.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
