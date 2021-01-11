package com.yunhe.scenicSpots.service.outer.imp;

import com.yunhe.common.mapper.ScenicSpotsMapper;
import com.yunhe.common.model.domain.ScenicSpotsExample;
import com.yunhe.common.model.domain.ScenicSpotsKey;
import com.yunhe.common.model.dto.ScenicSpotsDTO;
import com.yunhe.scenicSpots.service.outer.IScenicSpotsServiceOuter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 15:25
 */
@Service
@Slf4j
public class ScenicSpotsServiceOuterImpl implements IScenicSpotsServiceOuter {

    @Resource
    ScenicSpotsMapper scenicSpotsMapper;
    @Override
    public List<ScenicSpotsDTO> selectAllScenicSpotsOuter() {
        ScenicSpotsExample example = new ScenicSpotsExample();
        ScenicSpotsExample.Criteria criteria = example.createCriteria();
        criteria.andScenicSpotNameIsNotNull();
        return scenicSpotsMapper.selectByExample(example).stream().map(scenicSpot -> {
            return new ScenicSpotsDTO().convertFrom(scenicSpot);
        }).collect(Collectors.toList());
    }

    @Override
    public ScenicSpotsDTO selectScenicSpotByScenicSpotNameOuter(String scenicSpotName) {
        ScenicSpotsKey scenicSpotsKey = new ScenicSpotsKey();
        scenicSpotsKey.setScenicSpotName(scenicSpotName);
        return new ScenicSpotsDTO().convertFrom(scenicSpotsMapper.selectByPrimaryKey(scenicSpotsKey));
    }
}
