package com.demo.flight.timings.collision.utils;

import org.springframework.stereotype.Service;

import com.demo.flight.timings.collision.entity.FlightsSchedules;
import com.demo.flight.timings.collision.response.Message;
import com.demo.flight.timings.collision.response.ResponseObject;


@Service
public class BuildResponse {
	
	private ResponseObject responseObj = null;
	private Message message = null;

	
	public ResponseObject createResponseObject(FlightsSchedules  schedule) {
		responseObj = new ResponseObject();
		message = new Message();
		
		if(schedule!=null) {
			FlightsSchedules flightsSchedules = new FlightsSchedules();
			flightsSchedules.setTerminal(schedule.getTerminal());
			flightsSchedules.setDateAndTime(schedule.getDateAndTime());
			
			message.setMessage("Flight is successfully scheduled to "+schedule.getType() +"on Terminal" +schedule.getTerminal());
			message.setStatusCode("200");
			responseObj.setObject(flightsSchedules);
			responseObj.setMessage(message);
		} else {
		message.setMessage("Flight cannot be scheduled on requested terminal due on traffic ");
		message.setStatusCode("400");
		responseObj.setMessage(message);
	}
		return responseObj;
	}
}