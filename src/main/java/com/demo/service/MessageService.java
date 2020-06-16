package com.demo.service;

import com.demo.entity.Message;

import java.util.List;

public interface MessageService {
    List<Message> loadAll();
}
