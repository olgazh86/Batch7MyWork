package com.syntax.class26;

//task for HomeWork
public abstract class File {
	
	public void open() {
		System.out.println("To open .java file we need notepad");
	}
	public void edit() {
		System.out.println("Edit file pressing edit on settings");
	}
	public abstract void close();
}
class JavaFile extends File{
	
	public void close() {
		System.out.println("Close file by pressing X on the top right corner");
	}	
}

class WordFile extends JavaFile{
	
	public void open() {
		System.out.println("To open .doc file we need Microsoft Word to be installed");
	}
}

class PdFile extends WordFile{
	public void open() {
		System.out.println("T open .pdf file download Adobe PDF");
	}
}