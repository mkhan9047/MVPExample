package app.git.com.mvpexample.ModelPackage.Pojo;

import java.security.acl.Owner;

public class Repository {

    private String name;
    private int size;
    private String language;

    public String getLanguage() {
        return language;
    }

    private OwnersInfo owner;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public OwnersInfo getOwner() {
        return owner;
    }

    public class OwnersInfo {

        String url;

        public String getUrl() {
            return url;
        }
    }
}
