package wansboods.wansplayform.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import wansboods.wansplayform.po.TestUser;
import wansboods.wansplayform.vo.Result;

import javax.servlet.http.HttpServletRequest;

@Api(value = "User控制器", tags = {"20用户"}, hidden=false )
@Controller
@RequestMapping("/user")
public class TestController {
    @ApiOperation(value = "根据用户id查询用户信息", notes = "用户查询333", httpMethod = "GET", produces = "application/json")
    @ApiResponse(code = 200, message = "success", response = Result.class)
    @ResponseBody
    @RequestMapping(value = "queryUserById", method = RequestMethod.GET, produces = "application/json")
    public Result queryUserById(
            @ApiParam(name = "userId", required = true, value = "用户Id" )
            @RequestParam("userId") int userId, HttpServletRequest request ){
        TestUser user = new TestUser(userId, "haoyifen", 24);
        Result result = new Result();
        result.setCode(0);
        result.setData(user);
        result.setMessage("success");
        return result;
    }
}
