package com.example.sms_otp;

import com.example.sms_otp.config.TwilioConfig;
import com.twilio.Twilio;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication

public class SmsOtpApplication {



    public static void main(String[] args) {
        SpringApplication.run(SmsOtpApplication.class, args);
    }

}
