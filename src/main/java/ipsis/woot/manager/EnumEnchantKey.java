package ipsis.woot.manager;

public enum EnumEnchantKey {
    NO_ENCHANT("No Enchant"),
    LOOTING_I("Looting I"),
    LOOTING_II("Looting II"),
    LOOTING_III("Looting III");

    private String s;
    EnumEnchantKey(String s) {
        this.s = s;
    }

    public String getDisplayName() {
        return s;
    }

    public static EnumEnchantKey getEnchantKey(int v) {

        if (v < 0)
            return NO_ENCHANT;
        else if (v >= values().length)
            return LOOTING_III;

        return values()[v];
    }
}
