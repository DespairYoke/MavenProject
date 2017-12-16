package cn.damai.pattern;

import cn.damai.exception.Wrong;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Apattern {
    private String type="A";
    private String Content;

    private Logger logger=Logger.getLogger(Apattern.class);
    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Apattern parse(String line) throws Wrong {
        Apattern apattern=new Apattern();
        String[] items = line.split("[\\s_]+");
        List<String> tmp = Arrays.asList(items);
        LinkedList<String> linkedList = new LinkedList<String>(tmp);
        String stringa=linkedList.pop();
        logger.info("A="+stringa);
        if (!stringa.equals(apattern.getType()))
        {

                throw new Wrong();

        }
        apattern.setContent(linkedList.pop());
        return  apattern;
    }

}
