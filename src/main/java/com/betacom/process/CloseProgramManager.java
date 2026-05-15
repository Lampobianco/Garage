package com.betacom.process;

import com.betacom.services.Interfaces;

public class CloseProgramManager implements Interfaces {

    @Override
    public boolean execute() throws Exception {
        System.exit(0);
        return true;
    }
}