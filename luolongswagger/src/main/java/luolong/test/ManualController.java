package luolong.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manual")
@Api(description = "手动控制器-用来清除缓存等手动操作")

public class ManualController {




    @ApiOperation(value = "清除指定缓存",notes = "INTERSECT_BANKS_PREFIX:${appId} 应用银行列表交集; || " +
            "jhh:pay:app_channel_list_appId:${appId} 根据'应用Id'查询配置渠道表app_channels; || " +
            "jhh:pay:app_channel_list_channelId:${channelId} 根据'渠道Id'查询配置渠道表app_channels; || " +
            "jhh:pay:app_channel:${appId}_${channelId} 据'应用Id'和'渠道Id'查询配置渠道表app_channels || "+
            "jhh:pay:pay_channel_cfg:${channelId}_${version} 渠道版本配置信息"

            )
    @RequestMapping(value = "/cleanRedis", method = RequestMethod.POST )
    public String cleanRedis(@ApiParam("缓存的Key") @RequestParam("key") String key,
                             @ApiParam(value = "是否删除以key为前缀的所有缓存,0:否, 1:是y", required = false) @RequestParam("isVague") String isVague) {

        return "删除缓存完毕";
    }

}
