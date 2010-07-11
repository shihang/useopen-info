package net.useopen.info;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Useopen")
@XmlAccessorType(XmlAccessType.FIELD)
public class Useopen {

    @XmlElement(name = "Company")
    private List<Company> companys;

    public void setCompanys(List<Company> companys) {
        this.companys = companys;
    }

    public List<Company> getCompanys() {
        return companys;
    }
}
