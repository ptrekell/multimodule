package com.pt.testing.api;

import org.springframework.stereotype.Component;

@Component
public interface Connector {

    void showName();
    String getName();
}
