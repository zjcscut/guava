package cn.zjc.worker;

/**
 * @author zjc
 * @version 2016/10/20 0:26
 * @description
 */
public class QueueConsumerThread implements Runnable {

	@Override
	public void run() {
		consume();
	}

	private void consume() {
		while (true) {
			try {
				ConcreteEvent event = EventQueueRepository.EventQueue.take();
				System.out.println("从队列拿到的event:==>" + event.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
