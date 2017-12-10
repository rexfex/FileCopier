package org.itstep;

public class AppRunner {

	public static void main(String[] args) {
		
String fromPath = "C:\\Test\\1.jpg";
String toPath = "C:\\Test2\\1.jpg";
FileIO fileIO =new FileIO();
fileIO.copyFile(fromPath, toPath);
System.out.println("copy");

String fromPath2 = "C:\\Test\\1.txt";
String toPath2 = "C:\\Test2\\1.txt";
fileIO.copyFile(fromPath2, toPath2);
System.out.println("copy2");

	}
}