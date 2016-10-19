package cn.zjc.worker;

import com.google.common.eventbus.Subscribe;

/**
 * @author zjc
 * @version 2016/10/19 23:54
 * @description
 */
public class ConcreteEventListerner {


	@Subscribe
	public void commit(ConcreteEvent event){
		System.out.println("接收到的event:==>" + event.toString());
	}
}
