package com.home.aman;

import java.io.File;

public class FileExten {
	public static void main(String[] args) {

		System.out.println(FileExten.getFileExtension("/Users/pitiasfessahaie/Desktop/Python_Codes/start_jenkin.sh"));

	}

	public static String getFileExtension(String fullName) {
		String fileName = new File(fullName).getName();
		int dotIndex = fileName.indexOf(".");
		return fileName.substring(dotIndex+1);
	
	}
}

//	return (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);