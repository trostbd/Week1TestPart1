package com.example.lawre.week1test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity //extends AppCompatActivity {
{
   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }*/

    public static void main(String[] args)
    {
        MainActivity myAct = new MainActivity();
        System.out.println("First problem: \n");
        System.out.println("acp BECOMES " + myAct.f("acp"));
        System.out.println("Errors in strategy cannot be correct through tactical maneuvers BECOMES " + myAct.f("Errors in strategy cannot be correct through tactical maneuvers"));
        System.out.println("\nSecond problem: ");
        System.out.println("Hello there! Apple!");
        myAct.printG(myAct.g("Hello there! Apple!"));
    }

    public String f(String input)
    {
        char[] inputArray = input.toCharArray();
        char[] encryptedArray = new char[inputArray.length];
        int asciiCode=0;
        int alphabeticPosition=0;
        int encodeAlphabeticPosition=0;
        int encodeAscii=0;

        for(int i=0;i<inputArray.length;i++)
        {
            if(inputArray[i]==' ')
            {
                encryptedArray[i] = ' ';
            }
            else
                {
                asciiCode = inputArray[i];
                alphabeticPosition = asciiCode - 96;
                encodeAlphabeticPosition = 27 - alphabeticPosition;
                encodeAscii = encodeAlphabeticPosition + 96;
                encryptedArray[i] = (char) encodeAscii;
            }
        }
        return new String(encryptedArray);

    }

    public char[][] g(String input)
    {
        char[][] frequencyList =new char[2][27];
        for(int i = 0;i<27;i++)
        {
            frequencyList[0][i] = (char)(i+97);
            frequencyList[1][i] = 48;
        }
        char[] inputArray = input.toCharArray();
        for(int i=0;i<inputArray.length;i++)
        {
            if(inputArray[i]>64)
            {
                if (inputArray[i] < 97)
                    inputArray[i] = (char) (inputArray[i] + 32);
                int index = inputArray[i]-97;
                frequencyList[1][index]++;
            }
        }
        return frequencyList;
    }

    public void printG(char[][] gOutput)
    {
        for(int i = 0;i<26;i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(gOutput[j][i] + " ");
            System.out.println(" ");
        }
    }
}
