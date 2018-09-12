# HyperledgerFabricJavaDemo
使用fabric java sdk来连接HyperledgerFabric

### 包作用
- chaincode.invocation包：

    用来测试包的功能

- client包：
    
    用来封装CAClient、ChannelClient、FabricClient

- config包：

    用来配置ip地址，org、peer、ca等信息

- network包：
    
    创建channel通道，部署channel通道链码

- user 包：
    
- util 包

### 注意事项

由于某些原因，并没有上传对应的链码开发部分，所以本项目只适合参考。config.Config类中的LOCALHOST字段需要修改成你自己的ip地址。