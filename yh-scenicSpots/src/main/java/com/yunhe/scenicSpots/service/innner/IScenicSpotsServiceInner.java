package com.yunhe.scenicSpots.service.innner;

import com.yunhe.common.model.domain.ScenicSpots;
import com.yunhe.common.model.dto.ScenicSpotsDTO;

import java.util.List;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 10:15
 */
public interface IScenicSpotsServiceInner {

    ScenicSpots addScenicSpot(ScenicSpots scenicSpot);

    int deleteScenicSpotByScenicSpotName(String scenicSpotName);

    ScenicSpots selectScenicSpotByScenicSpotNameInner(String scenicSpotName);

    List<ScenicSpots> selectAllScenicSpotsInner();

    ScenicSpots updateScenicSpot(ScenicSpots scenicSpot);

    List<String> getScenicSpotPaymentMethod(String scenicSpotName);
}
