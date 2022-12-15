package com.perscholas.java_basics.hackkerank;

import java.io.*;

public class JumpToTheFlag {
    public static void main(String[] args) throws IOException {
        System.out.println(JumpToTheFlag.jumps(55, 4));
    }

    /*
     * Complete the 'jumps' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER flagHeight
     *  2. INTEGER bigJump
     */

    public static int jumps(int flagHeight, int bigJump) {
        // Write your code here:
        int jumps = 0;
        while (flagHeight != 0)
        {
            if (bigJump <= flagHeight)
            {
                flagHeight = flagHeight - bigJump;
                jumps++;
            }
            else
            {
                flagHeight-=1;
                jumps++;
            }
        }
        return jumps;
    }


}
