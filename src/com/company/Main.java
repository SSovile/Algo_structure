package com.company;

public class Main
{
    public static void main(String[] args)
    {
        String txt = "ABCDE FTDE";
        String pat = "DE";

        int q = 1;

        RabinKarp.search(pat, txt, q);
    }
}