//ListofCars
//Jacob Colburn
//CPT307
//Professor Bhatt
//03JUNE23





package com.quesucede.tree;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        Tree tree = new Tree();

        // CODE IS MODIFIED


        //Copyright (C) 2007-2014 by Brett Alistair Kromkamp <brett@perfectlearn.com>.
        

        tree.addNode("Ford");

        tree.addNode("Jeep", "Ford");

        tree.addNode("Dodge", "Ford");

        tree.addNode("Nissan", "Jeep");

        tree.addNode("GMC", "Jeep");

        tree.addNode("Volkswagen", "GMC");

        tree.addNode("Lexus", "GMC");

        tree.addNode("Honda", "Volkswagen");

        tree.addNode("Mazda", "Honda");

        tree.addNode("Kia", "Dodge");

        tree.addNode("Toyota", "Jeep");

        tree.display("Ford");

        System.out.println("***** DEPTH-FIRST ITERATION *****");

        // Default traversal strategy is 'depth-first'

        Iterator<Node> depthIterator = tree.iterator("Ford");

        while (depthIterator.hasNext()) {

            Node node = depthIterator.next();

            System.out.println(node.getIdentifier());

        }

        System.out.println("***** BREADTH-FIRST ITERATION *****");

        Iterator<Node> breadthIterator = tree.iterator("Ford", TraversalStrategy.BREADTH_FIRST);

        while (breadthIterator.hasNext()) {

            Node node = breadthIterator.next();

            System.out.println(node.getIdentifier());

        }

    }

}
