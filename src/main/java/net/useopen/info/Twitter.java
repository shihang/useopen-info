package net.useopen.info;

import java.util.List;

public class Twitter {

    private String id;
    private String name;
    private String description;
    private List<Twitter> follows;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Twitter> getFollows() {
        return follows;
    }
    public void setFollows(List<Twitter> follows) {
        this.follows = follows;
    }
}
