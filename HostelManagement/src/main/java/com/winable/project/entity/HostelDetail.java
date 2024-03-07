package com.winable.project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HostelDetail {
	private int studentId;
	private int roomNo;
	private int floorNo;
    private String buildingName;
    
    public HostelDetail(int studentId, int roomNo, int floorNo, String buildingName) {
		super();
		this.studentId = studentId;
		this.roomNo = roomNo;
		this.floorNo = floorNo;
		this.buildingName = buildingName;
	}
    public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
}

