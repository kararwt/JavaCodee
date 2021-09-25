package com.company;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueMain {

	public static void main(String[] args) {
		BlockingQueue bq = new ArrayBlockingQueue<>(10);
		Producer pd = new Producer(bq);
		Consumer cs = new Consumer(bq);
		new Thread(pd).start();
		new Thread(cs).start();

	}

}

class Producer implements Runnable {

	BlockingQueue bq = null;

	public Producer(BlockingQueue bq) {
		this.bq = bq;
	}

	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			try {
				bq.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class Consumer implements Runnable {

	BlockingQueue bq = null;

	public Consumer(BlockingQueue bq) {
		this.bq = bq;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println(bq.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}