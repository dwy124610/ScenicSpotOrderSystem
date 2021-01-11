package com.yunhe.common.model.dto;

import com.google.common.base.Converter;
import com.yunhe.common.model.domain.ScenicSpots;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 14:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ScenicSpotsDTO {

    private String scenicSpotName;

    private String scenicSpotAddress;

    public ScenicSpots convertTo() {
        ScenicSpotsConverter convert = new ScenicSpotsConverter();
        return convert.convert(this);
    }

    public ScenicSpotsDTO convertFrom(ScenicSpots scenicSpots) {
        ScenicSpotsConverter convert = new ScenicSpotsConverter();
        return convert.reverse().convert(scenicSpots);
    }
    private static class ScenicSpotsConverter extends Converter<ScenicSpotsDTO, ScenicSpots> {

        @Override
        protected ScenicSpots doForward(ScenicSpotsDTO scenicSpotsDTO) {

            return null;
        }
        //具体的转换内容
        @Override
        protected ScenicSpotsDTO doBackward(ScenicSpots scenicSpots) {
            ScenicSpotsDTO dto = new ScenicSpotsDTO();
            dto.setScenicSpotAddress(scenicSpots.getScenicSpotAddress());
            dto.setScenicSpotName(scenicSpots.getScenicSpotName());
            return dto;
        }
    }
}
