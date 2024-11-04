import java.io.*;

class filehandling {
    public static void main(String[] args) {
        int ch;
       
       		 try (FileReader fr = new FileReader("sample.txt");
           	  FileWriter fw = new FileWriter("new sample.txt")) 
         {
             
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch); 
                }
        } catch (IOException e) {
           
            e.printStackTrace();
        }
    }
}
