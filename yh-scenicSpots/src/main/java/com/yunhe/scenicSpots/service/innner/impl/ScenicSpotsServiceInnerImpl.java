package com.yunhe.scenicSpots.service.innner.impl;

import com.yunhe.common.mapper.ScenicSpotsMapper;
import com.yunhe.common.model.domain.ScenicSpots;
import com.yunhe.common.model.domain.ScenicSpotsExample;
import com.yunhe.common.model.domain.ScenicSpotsKey;
import com.yunhe.common.model.dto.ScenicSpotsDTO;
import com.yunhe.scenicSpots.service.innner.IScenicSpotsServiceInner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 10:19
 */
@Service
@Slf4j
public class ScenicSpotsServiceInnerImpl implements IScenicSpotsServiceInner {

    @Resource
    ScenicSpotsMapper scenicSpotsMapper;
    @Override
    public ScenicSpots addScenicSpot(ScenicSpots scenicSpot) {
        scenicSpotsMapper.insert(scenicSpot);
        return scenicSpot;
    }

    @Override
    public int deleteScenicSpotByScenicSpotName(String scenicSpotName) {
        log.info("删除景点名为:"+scenicSpotName+"的景点");
        ScenicSpotsKey scenicSpotsKey = new ScenicSpotsKey();
        scenicSpotsKey.setScenicSpotName(scenicSpotName);
        return scenicSpotsMapper.deleteByPrimaryKey(scenicSpotsKey);
    }

    @Override
    public ScenicSpots selectScenicSpotByScenicSpotNameInner(String scenicSpotName) {
        ScenicSpotsKey scenicSpotsKey = new ScenicSpotsKey();
        scenicSpotsKey.setScenicSpotName(scenicSpotName);
        return scenicSpotsMapper.selectByPrimaryKey(scenicSpotsKey);
    }


    @Override
    public List<ScenicSpots> selectAllScenicSpotsInner() {
        ScenicSpotsExample example = new ScenicSpotsExample();
        ScenicSpotsExample.Criteria criteria = example.createCriteria();
        criteria.andScenicSpotNameIsNotNull();
        return scenicSpotsMapper.selectByExample(example);
    }


    @Override
    public ScenicSpots updateScenicSpot(ScenicSpots scenicSpot) {
        scenicSpotsMapper.updateByPrimaryKey(scenicSpot);
        return scenicSpot;
    }

    @Override
    public List<String> getScenicSpotPaymentMethod(String scenicSpotName) {
        ScenicSpotsKey scenicSpotsKey = new ScenicSpotsKey();
        scenicSpotsKey.setScenicSpotName(scenicSpotName);
        ScenicSpots scenicSpot = scenicSpotsMapper.selectByPrimaryKey(scenicSpotsKey);
        return Arrays.asList(scenicSpot.getPaymentMethods().split(",").clone());
    }

}
