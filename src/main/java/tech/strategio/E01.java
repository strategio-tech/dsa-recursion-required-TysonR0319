package tech.strategio;

import java.util.*;

public class E01 {
    public int getNthFib(int n) {
        if (n <= 0) {
            return -1; // Invalid input
        } else if (n == 1) {
            return 0; // F0
        } else if (n == 2) {
            return 1; // F1
        } else {
            int prevPrev = 0;
            int prev = 1;
            int current = 0;
    
            for (int i = 3; i <= n; i++) {
                current = prev + prevPrev;
                prevPrev = prev;
                prev = current;
            }
    
            return current;
        }
    }
}


