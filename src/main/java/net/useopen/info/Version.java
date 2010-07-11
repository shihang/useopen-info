package net.useopen.info;

import java.util.Date;

public class Version {
    
    private Project project;
    private String release;
    private Date date;
    private String binary;
    private String source;
    private String branch;
    
	public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }
    public String getRelease() {
        return release;
    }
    public void setRelease(String release) {
        this.release = release;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getBinary() {
        return binary;
    }
    public void setBinary(String binary) {
        this.binary = binary;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

}
