package net.useopen.info;

import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Parser {

    public Useopen parse(String xml) throws Exception {
        URL xmlFile = Parser.class.getResource("/" + xml);
        JAXBContext context = JAXBContext.newInstance("net.useopen.info");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Useopen useopen = (Useopen)unmarshaller.unmarshal(xmlFile);
        return useopen;
    }
}
