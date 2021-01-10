package com.gotaught;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "cdi")
public interface ClassScheduleMapper {

	ClassSchedule toModel(ClassScheduleDTO classSchedule);
	ClassScheduleDTO toDTO(ClassSchedule classSchedule);
    void toModel(ClassScheduleDTO dto, @MappingTarget ClassSchedule tenant);    
    List<ClassSchedule> toModel(List<ClassScheduleDTO> classSchedules);
    List<ClassScheduleDTO> toDTO(List<ClassSchedule> classSchedules);
}
