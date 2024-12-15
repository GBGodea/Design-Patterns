package com.godea.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FileSystem extends Component {
    List<Component> listOfComponents = new ArrayList<Component>();

    public FileSystem(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        listOfComponents.add(component);
    }

    @Override
    public void remove(Component component) {
        listOfComponents.remove(component);
    }

    @Override
    public void print() {
        System.out.println("Main directory: " + name);
        System.out.println("Subdirectories:");
        for(Component component : listOfComponents) {
            System.out.println("\t"+component.name);
        }
        System.out.println();
    }
}
