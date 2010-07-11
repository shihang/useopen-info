package net.useopen.info;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Company {
    
    private String id;
    private String name;
    private String website;
    private Blog blog;
    private String forum;
    @XmlElement(name = "project")
    private List<Project> projects;
    
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getWebsite() {
        return website;
    }
    public void setForum(String forum) {
        this.forum = forum;
    }
    public String getForum() {
        return forum;
    }
    
    public void setBlog(Blog blog) {
        this.blog = blog;
    }
    public Blog getBlog() {
        return blog;
    }
    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
    public List<Project> getProjects() {
        return projects;
    }
}
