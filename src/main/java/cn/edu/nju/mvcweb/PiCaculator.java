package cn.edu.nju.mvcweb;

import org.springframework.stereotype.Component;

@Component
public class PiCaculator {
    public double calculatePi(double n) {
        double pi = 0;
        for (int i = 1; i < n; i++) {
            pi += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        return 4 * pi;
    }
}