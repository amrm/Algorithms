package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class LogParser {

    public static Collection<Integer> getIdsByMessage(String xml, String message)
            throws Exception {
        Collection<Integer> list = new ArrayList<>();
        if (xml == null || xml.isEmpty())
            return list;

        String lines[] = xml.split("entry");
        for (String line : lines) {

            int preId = line.indexOf("id=");
            if (preId > 0) {
                int postId = line.indexOf(">");
                int id = Integer.parseInt(line.substring(preId+4, postId-1));

                int msgId = line.indexOf("message>");
                if(msgId>0){
                    int endMsg = line.indexOf("</message>");
                    String msg=line.substring(msgId+8, endMsg);
                    if(msg.equals(message)){
                        list.add(id);
                    }
                }

            }

        }

        return list;
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<log>\n" +
                        "    <entry id=\"1\">\n" +
                        "        <message>Application started</message>\n" +
                        "    </entry>\n" +
                        "    <entry id=\"2\">\n" +
                        "        <message>Application ended</message>\n" +
                        "    </entry>\n" +
                        "</log>";

        Collection<Integer> ids = getIdsByMessage(xml, "Application ended");
        for (int id : ids)
            System.out.println(id);
    }

}
