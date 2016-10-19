package cn.zjc;

import cn.zjc.worker.ConcreteEvent;
import cn.zjc.worker.ConcreteEventListerner;
import cn.zjc.worker.EventQueueRepository;
import cn.zjc.worker.QueueConsumerThread;
import org.junit.Test;

/**
 * @author zjc
 * @version 2016/10/19 23:56
 * @description
 */
public class TestScope {

	@Test
	public void testAsyncEventBus() throws Exception{
		ConcreteEventListerner listerner = new ConcreteEventListerner();
		EventQueueRepository.asyncEventBus.register(listerner);
		EventQueueRepository.asyncEventBus.post(new ConcreteEvent("man","zjcscut"));
		EventQueueRepository.asyncEventBus.post(new ConcreteEvent("woman","ll"));
		System.in.read();
	}

	@Test
	public void testThread()throws Exception{


		EventQueueRepository.EventQueue.put(new ConcreteEvent("man","zjcscut"));

		new Thread(new QueueConsumerThread()).start();
		Thread.sleep(2000);

		EventQueueRepository.EventQueue.put(new ConcreteEvent("woman","ll"));

		System.in.read();
	}

}
