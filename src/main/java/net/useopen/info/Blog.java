package net.useopen.info;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Blog {

    private String url;
    @XmlElement(name = "category")
    private Set<String> categories;
    @XmlElement(name = "link")
    private Set<String> links;
    
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
    public void setCategories(Set<String> categories) {
        this.categories = categories;
    }
    public Set<String> getCategories() {
        return categories;
    }
    public void setLinks(Set<String> links) {
        this.links = links;
    }
    public Set<String> getLinks() {
        return links;
    }
}
