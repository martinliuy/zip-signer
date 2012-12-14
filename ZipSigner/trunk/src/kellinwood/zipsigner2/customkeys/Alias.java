package kellinwood.zipsigner2.customkeys;

public class Alias {

    long id;
    Keystore keystore;
    String name;
    String displayName;
    String password;
    boolean selected;
    boolean rememberPassword;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Keystore getKeystore() {
        return keystore;
    }
    public void setKeystore(Keystore keystore) {
        this.keystore = keystore;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isSelected() {
        return selected;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    public boolean rememberPassword() {
        return rememberPassword;
    }
    public void setRememberPassword(boolean rememberPassword) {
        this.rememberPassword = rememberPassword;
    }    
}
