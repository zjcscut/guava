package cn.zjc.worker;

import com.google.common.eventbus.AsyncEventBus;

import java.util.Queue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author zjc
 * @version 2016/10/19 23:51
 * @description
 */
public class EventQueueRepository {

	public static AsyncEventBus asyncEventBus = new AsyncEventBus(Executors.newFixedThreadPool(8));

	public static LinkedBlockingQueue<ConcreteEvent> EventQueue = new LinkedBlockingQueue<>();
}
