package com.winable.project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.winable.project.entity.HostelDetail;
import com.winable.project.repository.HostelDetailRepo;


import jakarta.annotation.PostConstruct;

@Service
public class HostelDetailslmpl implements HostelDetailService {

	@Autowired
	private HostelDetailRepo hostelDetailRepo;
	
	@Override
	public List<HostelDetail> getAllHostelDetail(){
		return hostelDetailRepo.findAll();
	}
	
	@Override
    public Optional<HostelDetail> getStudentById(int studentId) {
		return hostelDetailRepo.findById(studentId);
	   }
		
	@Override
	public void RegisterStudent(HostelDetail hostelDetail) {
		hostelDetailRepo.save(hostelDetail);
	}
	public HostelDetail updateStockDetail(HostelDetail updateHostelDetail) {
		Optional<HostelDetail> hostelDetail = hostelDetailRepo.findById(updateHostelDetail.getStudentId());
		if(hostelDetail.isPresent()) {
			hostelDetail.get().setStudentId(updateHostelDetail.getStudentId());
			hostelDetail.get().setRoomNo(updateHostelDetail.getRoomNo());
			hostelDetail.get().setFloorNo(updateHostelDetail.getFloorNo());
			hostelDetail.get().setBuildingName(updateHostelDetail.getBuildingName());
			hostelDetailRepo.save(hostelDetail.get());
		}
		return null;
	}
	
	@Override
	public HostelDetail deleteHostelDetail(int studentId) {
		Optional<HostelDetail> hostelDetail = hostelDetailRepo.findById(studentId);
		 if (hostelDetail.isPresent()) {
			 hostelDetailRepo.deleteById(studentId);
	            return hostelDetail.get();
	        } else {
	            return null;
	        }
	    }
	@Override
	public HostelDetail updateHostelDetail(HostelDetail hostelDetail) {
		// TODO Auto-generated method stub
		return null;
	}
	}

