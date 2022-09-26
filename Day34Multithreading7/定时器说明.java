package Day34Multithreading7;

public class 定时器说明 {
	/*
	 * 定时器的作用：
	 *     间隔特定的时间执行特定的程序。
	 *     例如：
	 *         每周要进行银行账户的总账操作。
	 *         每天要进行数据的备份操作。
	 *         在实际的开发中，每隔多久执行一段特定的程序，这种需求很常见
	 *         在java中可以采用多种方式实现：
	 *             1.可以使用sleep方法，睡眠，设置睡眠时间，每到这个时间点醒来，执行任务。这种方式是最原始的，这种方式是最原始的定时器。
	 *             2.在java的类库中已经写好了一个定时器：java.util.Timer;可以直接拿来用，不过这种方式在目前的开发中也很少用（因为现在很多高级框架都是支持定时任务的）。
	 *             3.在实际的开发中，目前使用较多的是Spring框架中提供的SpringTask框架（底层的实现原理就是java.util.Timer;），这个框架只要进行简单的配置，就可以完成定时器的任务。
	 */
}
