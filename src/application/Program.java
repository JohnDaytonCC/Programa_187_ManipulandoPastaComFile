package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = input.nextLine();
		
		File path = new File(strPath);
		
		// Comando seguinte ser� respons�vel por listar todas os diret�rios que est�o no caminho passado pelo usu�rio.
		// Utiliza��o de uma fun��o como argumento de outra fun��o.
		// Utiliza��o de refer�ncias a m�todos. File::isDirectory
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("\nFILES: ");
		for(File e : files) {
			System.out.println(e);
		}
		
		// Cria��o de uma subpasta
		/*
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created sucessfuly: " + sucess);
		*/

		input.close();
	}

}
