package com.winable.project.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.winable.project.entity.HostelDetail;
import jakarta.annotation.PostConstruct;

@Service
public class HostelDetailslmpl implements HostelDetailService {

	List<HostelDetail> hostelDetails=new ArrayList<>();
	private HostelDetail hosteldetails1;
	@PostConstruct
	public void init() {
		HostelDetail student1=new HostelDetail(111 , 101, 1, "Wing-A");
		HostelDetail student2=new HostelDetail(112 , 102, 2, "Wing-B");
		HostelDetail student3=new HostelDetail(113 , 103, 3, "Wing-C");
		hostelDetails.add(student1);
		hostelDetails.add(student2);
		hostelDetails.add(student3);
		System.out.println("Initialised Stock List:" + hostelDetails);
		
	}
	@Override
	public List<HostelDetail> getAllHostelDetail() {
		return hostelDetails;
	}
	@Override
	public HostelDetail RegisterStudent(HostelDetail hostelDetail) {
		if(hostelDetails.add(hostelDetail)) {
			return hostelDetail;
		}
		return null;
	}
	public HostelDetail updateStockDetail(HostelDetail updateHostelDetail) {
		for(HostelDetail hostelDetail : hostelDetails) {
		if(updateHostelDetail.getStudentId()==hostelDetail.getStudentId()) {
			hostelDetail.setStudentId(updateHostelDetail.getStudentId());
			hostelDetail.setRoomNo(updateHostelDetail.getRoomNo());
			hostelDetail.setFloorNo(updateHostelDetail.getFloorNo());
			hostelDetail.setBuildingName(updateHostelDetail.getBuildingName());
			return hostelDetail;
		}
	}
		return null;
	}
	@Override
	public boolean deleteHostelDetail(HostelDetail delHostelDetail) {
		for(HostelDetail hostelDetail : hostelDetails) {
			if(delHostelDetail.getStudentId()==hostelDetail.getStudentId()) {
				hostelDetails.remove(hostelDetail);
				return true;
			}
		}		
		return false;
	}
	@Override
	public HostelDetail updateHostelDetail(HostelDetail updateHostelDetail) {
		// TODO Auto-generated method stub
		return null;
	}
}
