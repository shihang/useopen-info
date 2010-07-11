package net.useopen.info;

import java.util.List;

public class Book {

    private String name;
    private String author;
    private String description;
    private String amazonUrl;
    private String skill;
    private List<Section> sections;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getAmazonUrl() {
        return amazonUrl;
    }
    public void setAmazonUrl(String amazonUrl) {
        this.amazonUrl = amazonUrl;
    }
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
    public List<Section> getSections() {
        return sections;
    }
    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
}
