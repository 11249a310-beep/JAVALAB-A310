import java.io.*;

class FitnessApp {
    public static void main(String[] args) throws IOException {
        String data = "Name: masthan\nAge: 20\nFitness Goal: Weight Loss";

        FileOutputStream fout = new FileOutputStream("profile.txt");
        fout.write(data.getBytes());
        fout.close();

        FileInputStream fin = new FileInputStream("profile.txt");
        int ch;

        System.out.println("User Profile:");
        while ((ch = fin.read()) != -1) {
            System.out.print((char) ch);
        }

        fin.close();
    }
}
