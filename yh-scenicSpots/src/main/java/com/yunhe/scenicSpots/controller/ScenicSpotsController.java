package com.yunhe.scenicSpots.controller;

import com.yunhe.common.model.ResultObject;
import com.yunhe.common.model.domain.ScenicSpots;
import com.yunhe.common.model.dto.ScenicSpotsDTO;
import com.yunhe.scenicSpots.service.innner.IScenicSpotsServiceInner;
import com.yunhe.scenicSpots.service.outer.IScenicSpotsServiceOuter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/11 10:25
 */
@Api(value = "scenicSpots" , description = "景区维护")
@RestController
@RequestMapping("/scenicSpots")
public class ScenicSpotsController {

    @Resource
    IScenicSpotsServiceInner scenicSpotsServiceInner;

    @Resource
    IScenicSpotsServiceOuter scenicSpotsServiceOuter;

    @ApiOperation("新增景区")
    @PostMapping("/add")
    public ResponseEntity<ResultObject> addScenicSpot(@RequestBody ScenicSpots scenicSpot){
        ScenicSpots results = scenicSpotsServiceInner.addScenicSpot(scenicSpot);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("删除景区")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "scenicSpotName" , value = "景区名字" , dataType = "String" , paramType = "query")
    })
    @DeleteMapping("/delete")
    public ResponseEntity<ResultObject> deleteScenicSpot(@RequestParam String scenicSpotName){
        scenicSpotsServiceInner.deleteScenicSpotByScenicSpotName(scenicSpotName);
        return new ResponseEntity<>(new ResultObject<>(null), HttpStatus.OK);
    }

    @ApiOperation("通过景区名字查询景区(内部展示所有信息)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "scenicSpotName" , value = "景区名字" , dataType = "String" , paramType = "query")
    })
    @GetMapping("/selectInner")
    public ResponseEntity<ResultObject> selectScenicSpotByScenicSpotName(@RequestParam String scenicSpotName){
        ScenicSpots results = scenicSpotsServiceInner.selectScenicSpotByScenicSpotNameInner(scenicSpotName);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("通过景区名字查询景区(对游客展示)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "scenicSpotName" , value = "景区名字" , dataType = "String" , paramType = "query")
    })
    @GetMapping("/selectOuter")
    public ResponseEntity<ResultObject> selectScenicSpotByScenicSpotNameOuter(@RequestParam String scenicSpotName){
        ScenicSpotsDTO results = scenicSpotsServiceOuter.selectScenicSpotByScenicSpotNameOuter(scenicSpotName);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("查询所有景区(对游客展示)")
    @GetMapping("/selectAllOuter")
    public ResponseEntity<ResultObject> selectAllScenicSpotsOuter(){
        List<ScenicSpotsDTO> results = scenicSpotsServiceOuter.selectAllScenicSpotsOuter();
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("查询所有景区(内部展示所有信息)")
    @GetMapping("/selectAllInner")
    public ResponseEntity<ResultObject> selectAllScenicSpotsInner(){
        List<ScenicSpots> results = scenicSpotsServiceInner.selectAllScenicSpotsInner();
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("更新景区（更新全部字段）")
    @PutMapping("/update")
    public ResponseEntity<ResultObject> updateScenicSpot(@RequestBody ScenicSpots scenicSpot){
        ScenicSpots results = scenicSpotsServiceInner.updateScenicSpot(scenicSpot);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("查看该景区支持的支付方式")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "scenicSpotName" , value = "景区名字" , dataType = "String" , paramType = "query")
    })
    @GetMapping("/getPaymentMethod")
    public ResponseEntity<ResultObject> getPaymentMethod(@RequestParam String scenicSpotName){
        List<String> results = scenicSpotsServiceInner.getScenicSpotPaymentMethod(scenicSpotName);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

}
