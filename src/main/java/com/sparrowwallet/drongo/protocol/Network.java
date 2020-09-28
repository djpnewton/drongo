package com.sparrowwallet.drongo.protocol;

public enum Network {
    BITCOIN("bc", "13", 0, 5),
    TESTNET("tb", "mn2", 111, 196);

    public final String hrp;
    public final String legacyPrefixes;
    public final int pkhVersion;
    public final int shVersion;
	 
    private Network(String hrp, String legacyPrefixes, int pkhVersion, int shVersion) {
        this.hrp = hrp;
        this.legacyPrefixes = legacyPrefixes;
        this.pkhVersion = pkhVersion;
        this.shVersion = shVersion;
    }
}
