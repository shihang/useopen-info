package net.useopen.info;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String xmlFile = "useopen_info.xml";
        Parser parser = new Parser();
        try {
            Useopen useopen = parser.parse(xmlFile);
            System.out.println(useopen.getCompanys().get(0).getBlog().getLinks());
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
