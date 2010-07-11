package net.useopen.info;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Project {

    private String id;
    private String name;
    private Company company;

    private String overview;
    private String license;
    private String website;
    private String manual;
    private String faq;
    private String wiki;
    private String download;
    private Blog blog; 

    private ForumList announceList;
    private ForumList userList;
    private ForumList devList;
    
    private Version stableVersion;
    private Version developVersion;

    private IssueTracker issueTracker;
    private Twitter twitter;

    private Developer leader;
    
    @XmlElement(name = "developer")
    private List<Developer> developers;

    @XmlElement(name = "article")
    private List<Article> articles;
    
    @XmlElement(name = "book")
    private List<Book> books;

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
    public void setCompany(Company company) {
        this.company = company;
    }
    public Company getCompany() {
        return company;
    }
    public void setOverview(String overview) {
        this.overview = overview;
    }
    public String getOverview() {
        return overview;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public String getLicense() {
        return license;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getWebsite() {
        return website;
    }
    public void setManual(String manual) {
        this.manual = manual;
    }
    public String getManual() {
        return manual;
    }
    public void setFaq(String faq) {
        this.faq = faq;
    }
    public String getFaq() {
        return faq;
    }
    public void setWiki(String wiki) {
        this.wiki = wiki;
    }
    public String getWiki() {
        return wiki;
    }
    public void setDownload(String download) {
        this.download = download;
    }
    public String getDownload() {
        return download;
    }
    public void setBlog(Blog blog) {
        this.blog = blog;
    }
    public Blog getBlog() {
        return blog;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }
    public List<Developer> getDevelopers() {
        return developers;
    }
    public void setLeader(Developer leader) {
        this.leader = leader;
    }
    public Developer getLeader() {
        return leader;
    }
    
    public Version getStableVersion() {
        return stableVersion;
    }
    public void setStableVersion(Version stableVersion) {
        this.stableVersion = stableVersion;
    }
    public Version getDevelopVersion() {
        return developVersion;
    }
    public void setDevelopVersion(Version developVersion) {
        this.developVersion = developVersion;
    }
    public ForumList getAnnounceList() {
        return announceList;
    }
    public void setAnnounceList(ForumList announceList) {
        this.announceList = announceList;
    }
    public ForumList getUserList() {
        return userList;
    }
    public void setUserList(ForumList userList) {
        this.userList = userList;
    }
    public ForumList getDevList() {
        return devList;
    }
    public void setDevList(ForumList devList) {
        this.devList = devList;
    }
    public IssueTracker getIssueTracker() {
        return issueTracker;
    }
    public void setIssueTracker(IssueTracker issueTracker) {
        this.issueTracker = issueTracker;
    }
    public Twitter getTwitter() {
        return twitter;
    }
    public void setTwitter(Twitter twitter) {
        this.twitter = twitter;
    }
    public List<Article> getArticles() {
        return articles;
    }
    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
