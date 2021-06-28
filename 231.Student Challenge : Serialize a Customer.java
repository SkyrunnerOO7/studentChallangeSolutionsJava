package Practise;


import java.io.*;
import java.lang.*;


public class testMain {

    public static void main(String[] args) throws Exception
    {
        //Input
        FileOutputStream fos=
                new FileOutputStream("D:\\java_programs\\Prograams\\New folder\\HackerRank\\Student_challange_231\\Float.txt");

        DataOutputStream dos = new DataOutputStream(fos);

        int n = 4;

        float f[] = {10.1f, 11.1f, 12.1f, 13.1f};

        for(Float x:f)
        {
            dos.writeFloat(x);
        }

        dos.close();
        fos.close();
        

        
        
        //output
        FileInputStream fis=
                new FileInputStream("D:\\java_programs\\Prograams\\New folder\\HackerRank\\Student_challange_231\\Float.txt");

        DataInputStream dis = new DataInputStream(fis);

        int n = 4;

        for(int i = 0; i<n; i++)
        {
            System.out.println(dis.readFloat());
        }

        dis.close();
        fis.close();
    }
}

