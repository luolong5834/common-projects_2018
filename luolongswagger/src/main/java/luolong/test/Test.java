package luolong.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author luolong
 * @date 2018/6/25
 */
@Api(description = "luolongswagger manager center")
@RestController
@RequestMapping("/luolong")
public class Test {

     @ApiOperation(value = "test case1", notes = "this is a test case")
     @RequestMapping(value = "/swagger",method = RequestMethod.POST)
     public String testSwagger(@ApiParam("请求参数") @RequestParam String param){
         System.out.println("swagger请求成功");
         return "test success/测试成功";
     }


    @ApiOperation(value = "test case2", notes = "this is other test case")
    @RequestMapping(value = "/swagger2",method = RequestMethod.POST)
    public String testSwagger2(@ApiParam("请求参数") @RequestParam String param){
        System.out.println("swagger2请求成功");
        return "test success2/测试成功2";
    }
}
