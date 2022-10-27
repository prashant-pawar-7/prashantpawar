package problem2;

import java.io.File;

public class GetFiles {

	public static void main(String[] args) {
		File f =new File("D:\\IOStream");
		String[] string=f.list();
		System.out.println("List of files present in IOStream folder");
		for (String string2 : string) {
			System.out.println(string2);
		}
		System.out.println();
		File[] iFile=f.listFiles();
		for (File file : iFile) {
			String s=file.getName();
			System.out.println("File Name : "+s);
			System.out.println("Length of file : "+file.length());
			System.out.println("Writable : "+file.canWrite());
			System.out.println("Readable : "+file.canRead());
			System.out.println("Executable : "+file.canExecute()+"\n");
		}
	}

}
