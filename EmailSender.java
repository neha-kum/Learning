package com.example.di.demo.component;

import org.springframework.stereotype.Component;

@Component("emailSender") 
public class EmailSender implements MessageSender {
@Override public void sendMessage(String message) { System.out.println("Email Sent: " + message); } }

