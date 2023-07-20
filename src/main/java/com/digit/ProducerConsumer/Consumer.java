package com.digit.ProducerConsumer;

public class Consumer extends Thread {
	Queue1 b;

	public Consumer(Queue1 q) {
		b = q;
	}

	public void run() {
		while (true) {
			b.get();
		}
	}
}
