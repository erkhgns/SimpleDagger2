package com.erkhgns.dagger2;

import dagger.Component;

@Component(modules = RandomInjectionModule.class)
public interface Doctor {
    Body injectBlood();
}
