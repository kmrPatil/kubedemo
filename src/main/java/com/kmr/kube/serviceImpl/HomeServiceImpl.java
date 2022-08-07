package com.kmr.kube.serviceImpl;

import com.kmr.kube.beans.User;
import com.kmr.kube.service.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

    Logger log = LoggerFactory.getLogger(HomeServiceImpl.class);

    @Override
    public String postData(User user) {
        log.info("Posting Data : {}",user.toString());
        return "Data posted successfully";
    }
}
