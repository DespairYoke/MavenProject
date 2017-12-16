package cn.damai.tcp;

import com.liumapp.DNSQueen.worker.process.WokerEar;
import com.liumapp.DNSQueen.worker.tcp.TCPSocketMonitor;
import org.apache.log4j.Logger;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class Config{
    private Logger logger=Logger.getLogger(Config.class);
    @Bean
    @ConfigurationProperties(prefix = "zwd.queen")
    public Param param() {
        logger.info("我执行了");
        return new Param();
    }
    @Bean
    public TCPSocketMonitor tcpSocketMonitor(Param param){
        logger.info("Tcp我执行了"+param.getContent()+param.getPort());
        return new TCPSocketMonitor(param.getPort());
    }
    @Bean
    public WokerEar wokerEar (Param param) {

        WokerEar wokerEar = new WokerEar();
        return wokerEar;
    }
}
