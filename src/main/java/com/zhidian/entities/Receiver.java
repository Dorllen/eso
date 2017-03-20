package com.zhidian.entities;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: Receiver
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-20 下午8:21:49
 *
 */

public class Receiver {
	private static final Logger log = LoggerFactory.getLogger(Receiver.class);

	private CountDownLatch latch;

	
	public Receiver(CountDownLatch latch) {
		this.latch = latch;
	}

	public void receiveMessage(String message) {
		log.info("Received <" + message + ">");
		latch.countDown();
	}
}
