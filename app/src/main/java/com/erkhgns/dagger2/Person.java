package com.erkhgns.dagger2;

import javax.inject.Inject;

public class Person {
    Body body;

    @Inject
    public Person(Body body) {
        this.body = body;
    }
}
