package com.venki.playground.tensa.zangetsu.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vm023561 on 3/31/15.
 */
public class CompositePlayground {

    public static abstract class Vector {

        public abstract void draw();

        public abstract String getName();

        public void addComponent(Vector vector) {
            throw new UnsupportedOperationException();
        }

        public List<Vector> getComponents() {
            throw new UnsupportedOperationException();
        }

        public Vector getChild(int i) {
            throw new UnsupportedOperationException();
        }

        public void removeComponent(Vector vector) {
            throw new UnsupportedOperationException();
        }

    }

    public static class Line extends Vector {

        public Line() {

        }

        @Override
        public void draw() {
            System.out.println("drawing line");
        }

        @Override
        public String getName() {
            return "line";
        }
    }

    public static class Circle extends Vector {

        @Override
        public void draw() {
            System.out.println("drawing circle");
        }

        @Override
        public String getName() {
            return "circle";
        }
    }

    public static class Rectangle extends Vector {

        @Override
        public void draw() {
            System.out.println("rectangle");
        }

        @Override
        public String getName() {
            return "rectangle";
        }
    }

    public static class Document extends Vector {

        private List<Vector> components = new ArrayList<Vector>();

        @Override
        public void draw() {

            if (components == null || components.size() == 0) {
                System.out.println("Document created with no shapes:");
            }

            final StringBuilder builder = new StringBuilder();
            builder.append("Creating a document with shapes:");
            int size = 0;
            for (final Vector component : components) {
                builder.append(component.getName());
                ++size;
                if (size != components.size()) {
                    builder.append(",");
                }
            }
            System.out.println(builder.toString());

        }

        @Override
        public String getName() {
            return "document";
        }

        @Override
        public List<Vector> getComponents() {
            return components == null ? new ArrayList<Vector>() : components;
        }

        @Override
        public Vector getChild(int index) {
            return components.get(index);
        }

        @Override
        public void removeComponent(final Vector vector) {
            components.remove(vector);
        }

        @Override
        public void addComponent(final Vector vector) {
            components.add(vector);
        }

        @Override
        public String toString() {
            return "Document{" + "components=" + components + '}';
        }
    }
}
