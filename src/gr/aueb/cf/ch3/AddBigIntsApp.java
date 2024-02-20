package gr.aueb.cf.ch3;

import java.math.BigInteger;

public class AddBigIntsApp {

    public static void main(String[] args) {

        BigInteger bigNum1 = new BigInteger("21989898989898987866765665323456534432");
        BigInteger bigNum2 = new BigInteger("1222232989786857855546099887665545478865");
        BigInteger result = bigNum1.add(bigNum2);

        System.out.printf("%,d ", result);
    }
}
