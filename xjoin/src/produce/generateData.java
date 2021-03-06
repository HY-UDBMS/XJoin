package produce;

import java.io.EOFException;
import java.io.File;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class generateData {

    public static void buildRDBValue() throws  Exception{
        PrintWriter pw = new PrintWriter(new File("xjoin/src/multi_rdbs/testTables/test.csv"));
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        // 1 million
        for(int i=0; i<1000000; i++){
            String s = rand.nextInt(50000) + "";
            sb.append(s+(char)(rand.nextInt(26) + 'a'));
            sb.append(',');
            s = rand.nextInt(50000)+"";
            sb.append(s+(char)(rand.nextInt(26) + 'a'));
            sb.append('\n');
        }
        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
    }
    public static void main(String[] args) throws Exception{
        buildRDBValue();
    }
}
