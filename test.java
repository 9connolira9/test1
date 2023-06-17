package 核算;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //签约额
        double qye = 0.0;
        //利率率
        double irate = 0.0;
        //结果
        double res = 0.0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            qye = scanner.nextDouble();
            irate = scanner.nextDouble();
            irate = irate /100;
            if (qye <= 200000) {
                res = qye * 0.02 * irate / 0.17;
            } else if (qye > 200000 && qye < 500000) {
                res = qye * 0.017 * irate / 0.17;
            }else if (qye >= 500000 && qye < 2000000){
                res = qye * 0.014 * irate / 0.17;
            }else if (qye >= 2000000 && qye < 10000000){
                res = qye * 0.011 * irate / 0.17;
            }else {
                res = qye * 0.008 * irate / 0.17;
            }
            System.out.println(res);
        }
    }
}
