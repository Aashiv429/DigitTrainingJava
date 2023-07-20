package com.digit.ProducerConsumer;
public class Producer extends Thread{
  Queue1 a;
  public Producer(Queue1 q)
  {
	  a=q;
  }
  public void run() {
	  int i =0;
	  while(true)
	  {
		  a.put(i++);
	  }
  }
  }
