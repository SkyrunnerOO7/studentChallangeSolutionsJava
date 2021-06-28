package Practise;


import java.io.*;
import java.lang.*;


public class testMain {

    public static void main(String[] args) throws Exception
    {
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
        dos.close();
    }
}

