package wansboods.wansplayform.po;

import io.swagger.annotations.ApiModelProperty;

public class TestUser {
    @ApiModelProperty(value="用户ID" ,notes="表用户ID")
    private int userId;
    @ApiModelProperty(value="用户名称" ,notes="表用户名称")
    private String name;
    @ApiModelProperty(value="用户年龄" ,notes="表用户年龄")
    private int age;

    public TestUser() {
    }

    public TestUser(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public TestUser setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public TestUser setAge(int age) {
        this.age = age;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public TestUser setUserId(int userId) {
        this.userId = userId;
        return this;
    }
}
