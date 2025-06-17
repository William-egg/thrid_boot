package com.example.thrid_boot;
// jcy TMD
public class newbranch {

    public int id;
    newbranch() {
        System.out.println("newbranch");
    }
    newbranch(String name) {
        System.out.println("newbranch with name: " + name);
    }
    newbranch(int id) {
        this.id = id;
        System.out.println("newbranch with id: " + id);
    }
}
