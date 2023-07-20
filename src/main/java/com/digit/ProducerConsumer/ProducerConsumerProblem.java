package com.digit.ProducerConsumer;
public class ProducerConsumerProblem {
public static void main(String[] args) {
	Queue1 q =new Queue1();
	Producer p = new Producer(q);
	Consumer c = new Consumer(q);
	
	p.start();
	c.start();
}
}
