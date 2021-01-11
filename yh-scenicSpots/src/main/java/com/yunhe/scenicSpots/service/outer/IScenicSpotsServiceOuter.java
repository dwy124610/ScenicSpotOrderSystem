package com.yunhe.scenicSpots.service.outer;

import com.yunhe.common.model.dto.ScenicSpotsDTO;

import java.util.List;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 15:24
 */
public interface IScenicSpotsServiceOuter {

    List<ScenicSpotsDTO> selectAllScenicSpotsOuter();

    ScenicSpotsDTO selectScenicSpotByScenicSpotNameOuter(String scenicSpotName);

}
