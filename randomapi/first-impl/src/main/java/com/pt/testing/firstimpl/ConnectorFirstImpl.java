package com.pt.testing.firstimpl;


import com.pt.testing.api.Connector;
import org.springframework.stereotype.Component;

@Component
public class ConnectorFirstImpl implements Connector {
    @Override
    public void showName() {
        System.out.println("show name from first impl");
    }

    @Override
    public String getName() {
        return "First Impl";
    }
}
