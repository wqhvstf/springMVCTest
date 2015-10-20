package com.springmvc.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask {

	@Scheduled(cron = "0/5 * * * * ?")
	public void scheduler() {
		System.out.println("scheduler Task Begin!");
	}
}
