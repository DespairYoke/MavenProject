package com.maven.aa;

import com.hlw.aa.Main;
import com.liumapp.DNSQueen.queen.Queen;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Main.class})
public class TestCase {
    @Test
    public void test1(){
        Queen queen=new Queen();

        queen.setPort(40212);
        try {
            queen.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        queen.say("A say hello world");
        try {
            System.out.println(queen.hear());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
