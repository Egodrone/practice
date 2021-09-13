package org.example;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args ) throws JAXBException, FileNotFoundException {
        System.out.println( "Lets go!" );

        String t1 = "...........***...................*...................*...................*...................*......";
        String t2 = ".................................*...................*...................*...................*......";
        String t3 = "..*..........*...................*...................*...................*...................*......";
        String t4 = ".....*.......*...................*.......................................*...................****...";
        String t5 = ".....*.......*...................*.......................................*...................*......";
        String t6 = ".....*.......*.......................................*...................*...................****...";
        String t7 = ".....*.......*...................*..........*............................*...................****...";
        String t8 = ".....*.......*...................*...................*...............*...................**.........";
        String t9 = ".............*...................*...................*...................*...................*..*...";
        String t10 = ".....*...........................*...................*...................*...................*..*...";


        String[] str = {t1, t2, t3, t4, t5, t6, t7, t8, t9, t10};
        ArrayList<String> arrlist = new ArrayList<String>();

        int countTimes = 0;
        int totalCount = 0;

        String resultStr = "";

        for (int i = 0; i < str.length; i++) {
            resultStr = "";

            for (int b = 0; b < str[i].length(); b++) {
                if (str[i].charAt(b) == '*') {
                    countTimes = countTimes + 1;
                    totalCount = totalCount + 1;
                }
            }

            int tmpCount = 0;
            int allCount = 0;

            while(tmpCount < str[i].length() - totalCount) {
                resultStr = resultStr + ".";
                tmpCount++;
                allCount++;
            }

            tmpCount = 0;

            while (tmpCount < countTimes) {
                tmpCount++;
                allCount++;
                resultStr = resultStr + "*";
            }

            while (allCount != str[i].length()) {
                resultStr = resultStr + ".";
                allCount++;
            }

            countTimes = 0;
            System.out.println("Result: " + resultStr);
            arrlist.add(resultStr);
        }


        for (String res : arrlist) {
            System.out.println("res = " + res);
        }

    }
}
