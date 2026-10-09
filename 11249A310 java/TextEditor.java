import java.io.*;
class TextEditor {
    public static void main(String[] args ) throws IOException{
        FileWriter fw =new FileWriter("text.txt");
        fw.write("welcome to java programming!");
        fw.close();
        FileReader fr=new FileReader("text.txt");
        int ch;
        System.out.println("File Contant:");
        while((ch=fr.read())!=-1) {
            System.out.print((char)ch);
        }
        fr.close();
    }
}
