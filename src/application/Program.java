package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = input.nextLine();
		
		File path = new File(strPath);
		
		// Comando seguinte será responsável por listar todas os diretórios que estão no caminho passado pelo usuário.
		// Utilização de uma função como argumento de outra função.
		// Utilização de referências a métodos. File::isDirectory
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
		
		// Criação de uma subpasta
		/*
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created sucessfuly: " + sucess);
		*/

		input.close();
	}

}
