package com.venki.playground.tensa.zangetsu.designpattern.composite;

import static com.venki.playground.tensa.zangetsu.designpattern.composite.CompositePlayground.Circle;
import static com.venki.playground.tensa.zangetsu.designpattern.composite.CompositePlayground.Document;
import static com.venki.playground.tensa.zangetsu.designpattern.composite.CompositePlayground.Line;
import static com.venki.playground.tensa.zangetsu.designpattern.composite.CompositePlayground.Rectangle;

import org.junit.Test;

import com.venki.playground.tensa.zangetsu.designpattern.composite.CompositePlayground.Vector;

/**
 * Created by vm023561 on 3/31/15.
 */
public class CompositePlaygroundTest {

    @Test
    public void testCreateADocumentWithShapes() {

        final Vector circle = new Circle();
        final Vector line = new Line();
        final Vector rectangle = new Rectangle();
        final Vector document = new Document();
        document.addComponent(circle);
        document.addComponent(line);
        document.addComponent(rectangle);
        document.draw();

    }
}
