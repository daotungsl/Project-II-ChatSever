package entityPost;

public class UserData {
    private UserAttributes attributes;
    private String type;

    public UserData() {
    }

    public UserData(UserAttributes attributes, String type) {
        this.attributes = attributes;
        this.type = type;
    }

    public UserAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(UserAttributes attributes) {
        this.attributes = attributes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
