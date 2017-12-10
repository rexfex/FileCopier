package org.itstep;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileIOTest {

	@Test
	void testCopyFile() {
		String fromPath = "C:\\Test\\1.jpg";
		String toPath = "C:\\Test2\\1.jpg";
		
		FileIO fileIO =new FileIO();
		fileIO.copyFile(fromPath, toPath);
		byte[]bytes = fileIO.readDataFromFile(toPath);
		assertTrue(bytes.length >0);
		
		File file= new File(toPath);
		file.delete();
	}

	@Test
	void testCopeTextFile() {
		String fromPath = "C:\\Test\\1.txt";
		String toPath = "C:\\Test2\\1.txt";
		FileIO fileIO =new FileIO();
		fileIO.copeTextFile(fromPath, toPath);
		byte[]bytes = fileIO.readDataFromFile(toPath);
		assertTrue(bytes.length >0);
		
		File file= new File(toPath);
		file.delete();
		
	}

}

