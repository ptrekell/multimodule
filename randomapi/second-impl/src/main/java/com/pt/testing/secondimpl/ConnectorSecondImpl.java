package com.pt.testing.secondimpl;

import com.pt.testing.api.Connector;
import org.springframework.stereotype.Component;

@Component
public class ConnectorSecondImpl implements Connector {
    @Override
    public void showName() {
        System.out.println("from second impl");
    }

    @Override
    public String getName() {
        return "Second implementation";
    }
}
