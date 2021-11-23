package com.company;


public class Main {

    public static void main(String[] args)
    {
        int[][] graph = new int[][]{
                {0, 5, 2, 0, 0, 0},
                {5, 0, 0, 3, 10, 0},
                {2, 0, 0, 0, 3, 0},
                {0, 3, 0, 0, 0, 0},
                {0, 10, 3, 0, 0, 6},
                {0, 0, 0, 0, 6, 0}};

        int[] visit = new int[6];
        int u = 0;
        int v = 0;

        for (int i = 0; i < 6; i++)
        {
            visit[i] = 0;
            for (int k = 0; k < 6; k++)
            {
                if (graph[i][k] == 0)
                {
                    graph[i][k] = 10;
                }
            }
        }

        visit[0] = 1;

        for (int counter = 1; counter < 6; counter++)
        {
            int min = 10;
            for (int i = 0; i < 6; i++)
            {
                if (visit[i] == 1)
                    for (int k = 0; k < 6; k++)
                    {
                        if (visit[k] == 0)
                        {
                            if (min > graph[i][k])
                            {
                                min = graph[i][k];
                                u = i;
                                v = k;
                            }
                        }
                    }
            }
            visit[v] = 1;
            System.out.println("Start from " + u + " to " + v + " is "+ min);
        }
    }
}
