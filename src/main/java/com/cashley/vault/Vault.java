package com.cashley.vault;

import java.util.ArrayList;
import java.util.List;

public class PVault {

    private List<Credentials> credentials = new ArrayList<>();

    public PVault() {
    }

    public List<Credentials> getCredentials() {
        return credentials;
    }

    public void add(Credentials credential) {
        credentials.add(credential);
    }
    public void remove(Credentials credential) {
        credentials.remove(credential);
    }
}