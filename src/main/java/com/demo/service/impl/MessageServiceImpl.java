package com.demo.service.impl;

import com.demo.entity.Message;
import com.demo.mapper.MessageMapper;
import com.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public List<Message> loadAll() {
        return messageMapper.selectAll();
    }
}
