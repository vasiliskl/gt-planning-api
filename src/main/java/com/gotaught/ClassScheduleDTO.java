package com.gotaught;

import java.time.LocalTime;

import javax.validation.constraints.NotNull;

import com.gotaught.dto.BaseDTO;

public class ClassScheduleDTO extends BaseDTO{

	@NotNull
    private String lessonId;
	@NotNull
    private String dayOfWeek;
	@NotNull
	private LocalTime startTime;
	@NotNull
	private LocalTime endTime;
}
