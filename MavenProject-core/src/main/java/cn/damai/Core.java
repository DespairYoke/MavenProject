package cn.damai;

import cn.damai.tcp.Config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 *
 */
@Configuration
@Import({Config.class})
public class Core
{

}
