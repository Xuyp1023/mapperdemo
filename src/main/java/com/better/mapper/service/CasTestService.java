package com.better.mapper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.better.mapper.entity.CasTestEntity;
import com.better.mapper.mapper.CasTestMapper;

@Service
public class CasTestService {

    @Autowired
    private CasTestMapper mapper;

    public CasTestEntity findCas(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    public CasTestEntity saveAdd(CasTestEntity entity) {
        int result = mapper.insertSelective(entity);
        System.out.println(result);
        return entity;
    }

}
