package com.arthur.email.core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
