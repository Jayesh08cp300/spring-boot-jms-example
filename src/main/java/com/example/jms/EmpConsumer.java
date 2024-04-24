package com.example.jms;

import com.example.dto.Employee;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;
import jakarta.jms.ObjectMessage;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmpConsumer implements MessageListener {

	@SneakyThrows
	@Override
	@JmsListener(destination = "${active-mq.topic}")
	public void onMessage(Message message) {
		ObjectMessage objectMessage = (ObjectMessage) message;
		Employee employee = (Employee) objectMessage.getObject();
		log.info("Received message from topic = " + employee.toString());
	}
}
