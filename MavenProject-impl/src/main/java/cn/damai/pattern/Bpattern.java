package cn.damai.pattern;

import cn.damai.exception.Wrong;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Bpattern {
    private String type="B";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Bpattern parse(String line) throws Wrong {
        Bpattern bpattern=new Bpattern();
        String[] items = line.split("[\\s_]+");
        List<String> tmp = Arrays.asList(items);
        LinkedList<String> linkedList = new LinkedList<String>(tmp);
        if (!linkedList.pop().equals(bpattern.getType()))
        {

            throw new Wrong();

        }
        return  bpattern;
    }
}
