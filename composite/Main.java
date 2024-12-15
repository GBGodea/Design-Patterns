package com.godea.structural.composite;

public class Main {
    public static void main(String[] args) {
        Component cDisk = new FileSystem("C disk");
        Component dDisk = new FileSystem("D disk");

        Component JPG = new File("photo.jpg");
        Component docx = new File("table.docx");
        cDisk.add(JPG);
        cDisk.add(docx);
        cDisk.remove(docx);
        cDisk.print();

        Component exe = new File("NotAMalware.exe");
        Component exeTwo = new File("DefinitelyNotAMalware.docx");
        dDisk.add(exe);
        dDisk.add(exeTwo);
        dDisk.print();
    }
}
