package com.winable.project.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.winable.project.entity.HostelDetail;

@Service
public interface HostelDetailService {
    List<HostelDetail> getAllHostelDetail();
    HostelDetail RegisterStudent(HostelDetail hostelDetail);
    HostelDetail updateHostelDetail(HostelDetail updateHostelDetail);
    public boolean deleteHostelDetail(HostelDetail delHostelDetail);
    }