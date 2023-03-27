package org.government.insurance.validation;

public class ClientInfoChecker {

    public boolean trIdChecker (Long trId) {
        boolean retCheck;
        String numStr = Long.toString(trId);
        retCheck = numStr.length() == 11;
        return retCheck;
    }
}
