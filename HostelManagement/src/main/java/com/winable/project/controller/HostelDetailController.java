package com.winable.project.controller;

import java.util.*;
//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.winable.project.entity.HostelDetail;
import com.winable.project.service.HostelDetailService;



@RestController
@RequestMapping("/hostelDetail")
public class HostelDetailController {
  @Autowired
	private HostelDetailService HostelDetailService ;
	
	@GetMapping("/getAllHostelDetail")
	public List<HostelDetail> getAllHostelDetail(){
		return HostelDetailService.getAllHostelDetail();
		}
	
	@PostMapping("/registerStudent")
	public HostelDetail registerStudent(@RequestBody HostelDetail hostelDetail) {
		return HostelDetailService.RegisterStudent(hostelDetail);
	}
  @PutMapping("/putStock")
  public HostelDetail updateHostelDetail(@RequestBody HostelDetail updateHostelDetail) {
  	return HostelDetailService.updateHostelDetail(updateHostelDetail);
  }
  @DeleteMapping("/deleteHostel/{id}")
  public boolean deleteHostelDetail(@RequestBody HostelDetail delHostelDetail) {
  	return HostelDetailService.deleteHostelDetail(delHostelDetail);
  }
}

