package com.venki.playground.tensa.zangetsu.graph;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by vm023561 on 4/29/15.
 */
public class Graph
{
    private final int V;
    private int E;
    private Map<Integer,List<Integer>> adj;

    public Graph(int V){
        if(V<0){
            throw new IllegalArgumentException("Vertices cannot be negative");
        }
        this.V=V;
        this.E=0;
        adj = Maps.newHashMap();
        for(int i=0;i<V;i++){
            adj.put(i,new ArrayList<Integer>());
        }
    }

    public int getV(){
        return V;
    }

    public int getE(){
        return E;
    }

    public void addEdge(int u, int w){
        validateVertex(u);
        validateVertex(w);
        adj.get(u).add(w);
        E++;
        adj.get(w).add(u);
        E++;

    }

    public List<Integer> adj(int v){
        validateVertex(v);
        return adj.get(v);
    }

    public int degree(int v){
        validateVertex(v);
        return adj.get(v).size();
    }


    private void validateVertex(final int vertex){
        if(vertex<0||vertex>=V){
            throw new IndexOutOfBoundsException("vertex not in bound");
        }
    }

}
