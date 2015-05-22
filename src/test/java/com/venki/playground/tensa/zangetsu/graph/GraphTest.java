package com.venki.playground.tensa.zangetsu.graph;

import org.junit.Test;

/**
 * Created by vm023561 on 4/29/15.
 */
public class GraphTest
{

    @Test
    public void testCreateGraph(){

        Graph graph = new Graph(20);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(3,5);
        graph.addEdge(4,5);
        System.out.println(graph.getE());
        System.out.println(graph.getV());
        System.out.println("Adj1" + graph.adj(1));
        System.out.println("Adj2" + graph.adj(2));
        System.out.println("Adj3" + graph.adj(3));
        System.out.println("Adj4"+graph.adj(4));
        System.out.println("Adj5"+graph.adj(5));
        System.out.println("Degree of 1 is "+graph.degree(1));
        System.out.println("Degree of 2 is "+graph.degree(2));
        System.out.println("Degree of 3 is "+graph.degree(3));
        System.out.println("Degree of 4 is "+graph.degree(4));
        System.out.println("Degree of 5 is "+graph.degree(5));
    }
}
