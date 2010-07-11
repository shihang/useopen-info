package net.useopen.info;

import java.util.List;

public class Developer {

    private String id;
    private String firstname;
    private String lastname;
    private Project project;

    private String title;
    private Blog blog;
    private List<Developer> friends;
    private Twitter twitter;
    private List<Presentation> presentations;
    private String skill;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Blog getBlog() {
        return blog;
    }
    public void setBlog(Blog blog) {
        this.blog = blog;
    }
    public List<Developer> getFriends() {
        return friends;
    }
    public void setFriends(List<Developer> friends) {
        this.friends = friends;
    }
    public Twitter getTwitter() {
        return twitter;
    }
    public void setTwitter(Twitter twitter) {
        this.twitter = twitter;
    }
    public List<Presentation> getPresentations() {
        return presentations;
    }
    public void setPresentations(List<Presentation> presentations) {
        this.presentations = presentations;
    }
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
}
