package com.example.thrid_boot;

import com.example.thrid_boot.service.userService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

@SpringBootTest
class ThridBootApplicationTests {

    @Autowired
    private userService userService;

    @Test
    void contextLoads() {
        System.out.println("".length());
    }
    @Test
    void test() throws AWTException, LineUnavailableException, IOException, UnsupportedAudioFileException {
        String filePath = "C:\\Users\\Administrator\\Desktop\\新建文件夹\\622.wav";
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath));
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    }
    @Test
    void testGetPassword() {
        // Assuming userService is autowired and available
        String userName = "admin11";
        String password = userService.getPassword(userName);
        System.out.println("Password for " + userName + ": " + (password == null));
    }
    @Test
    public void testInsertUser() {
        // Assuming userService is autowired and available
        String userName = "admin11";
//        userService.insertUser();
        try{
            userService.insertUser(userName,"1234");
        }catch (Exception e){
            System.out.println("INTO ERROR");
            System.out.println("Error inserting user: " + e.getMessage());
        }

    }
}
