package net.useopen.info;

import java.util.Set;

public class IssueTracker {

    private String url;
    private Project project;
    private Set<String> components;
    
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }
    public Set<String> getComponents() {
        return components;
    }
    public void setComponents(Set<String> components) {
        this.components = components;
    }
}
