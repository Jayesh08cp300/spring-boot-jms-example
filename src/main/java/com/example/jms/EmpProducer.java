package com.example.jms;

import com.example.dto.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmpProducer {
	@Autowired
	JmsTemplate jmsTemplate;

	@Value("${active-mq.topic}")
	private String topic;

	public void sendMessage(Employee employee) {
		jmsTemplate.convertAndSend(topic, employee);
	}
}
