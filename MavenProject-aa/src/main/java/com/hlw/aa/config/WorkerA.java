package com.hlw.aa.config;

import cn.damai.exception.Wrong;
import cn.damai.pattern.Apattern;
import com.liumapp.DNSQueen.worker.ready.StandReadyWorker;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class WorkerA extends StandReadyWorker{
    Logger logger=Logger.getLogger(WorkerA.class);
    @Override
    public String doWhatYouShouldDo(String s) {
        logger.info("哈哈");
        Apattern apattern=new Apattern();
        try {
            apattern.parse(s);
            System.out.println(s);
        } catch (Wrong wrong) {
            wrong.printStackTrace();
            return null;
        }
        return "success";
    }
}
