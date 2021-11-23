package com.company;


public class Main {

    public static void main(String[] args) {
        int[][] graph = new int[][]{{0, 5, 2, 0, 0, 0}, {5, 0, 0, 3, 10, 0}, {2, 0, 0, 0, 3, 0},
                {0, 3, 0, 0, 0, 0}, {0, 10, 3, 0, 0, 6}, {0, 0, 0, 0, 6, 0}};

        int[] visit = new int[6];
        int min = 0;
        int u = 0;
        int v = 0;

        for (int i = 0; i < 6; i++) {
            visit[i] = 0;
            for (int j = 0; j < 6; j++) {
                if (graph[i][j] == 0) {
                    graph[i][j] = 999;
                }
            }
        }
        visit[0] = 1;
        for (int counter = 1; counter < 6; counter++) {
            min = 999;
            for (int i = 0; i < 6; i++) {
                if (visit[i] == 1)
                    for (int j = 0; j < 6; j++) {
                        if (visit[j] == 0) {
                            if (min > graph[i][j]) {
                                min = graph[i][j];
                                u = i;
                                v = j;
                            }
                        }
                    }
            }
            visit[v] = 1;
            System.out.println("source" + u + ">" + v + min);
        }
    }
}
