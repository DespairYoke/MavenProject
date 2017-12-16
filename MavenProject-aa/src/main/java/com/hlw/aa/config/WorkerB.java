package com.hlw.aa.config;

import cn.damai.exception.Wrong;
import cn.damai.pattern.Bpattern;
import com.liumapp.DNSQueen.worker.ready.StandReadyWorker;
import org.springframework.stereotype.Component;

@Component
public class WorkerB extends StandReadyWorker{
    @Override
    public String doWhatYouShouldDo(String s) {
        System.out.println("想想");
        Bpattern bpattern=new Bpattern();
        try {
            bpattern.parse(s);
            System.out.println(s);
        } catch (Wrong wrong) {
            wrong.printStackTrace();
            return null;
        }
        return "success";
    }

}
