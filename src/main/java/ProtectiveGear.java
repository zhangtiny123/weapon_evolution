/**
 * Created by tiny on 14-10-24.
 */
public class ProtectiveGear {
    private String name;
    private int protectiveValue;

    public ProtectiveGear() {
        this.name = "";
        this.protectiveValue = 0;
    }

    public ProtectiveGear(String name, int protectiveValue) {
        this.name = name;
        this.protectiveValue = protectiveValue;
    }

    public String getName() {
        return name;
    }

    public int getProtectiveValue() {
        return protectiveValue;
    }
}
