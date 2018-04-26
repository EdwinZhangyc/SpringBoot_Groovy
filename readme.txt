Spring Boot Groovy篇
    21.3 组合使用Groovy与Spring Boot CLI
        我们在编写Groovy代码的时候可以省略如下内容：
            1、分号
            2、像public和private这样的权限修饰符
            3、属性的getter和setter方法
            4、方法返回return关键字
        21.3.1 编写Groovy控制器
        21.3.2 使用Groovy Repository实现数据Persistence
        21.3.3 运行Spring Boot CLI
            安装CLI
                1、Groovy Environment Manager，GVM
                2、手动下载spring boot cli同时安装，使用cmd 执行命令spring --version即可得知是否安装成功
            使用CLI运行Contacts应用
                执行spring run *.groovy
    21.4 通过Actuator获取了解应用内部状况
        我们只需在groovy文件中添加@Grab("spring-boot-starter-actuator")
        或是在java中gradle.build添加compile("org.springframework.boot:spring-boot-starter-actuator")
        Actuator提供了以下特性：
            GET /autoconfig：描述了SpringBoot在使用自动配置的时候，所做出的决策；
            GET /beans：列出运行应用所配置的bean；
            GET /configprops：列出应用中能够用来配置bean的所有属性及其当前的值；
            GET /dump:列出应用的线程，包括每个线程的栈跟踪信息；
            GET /env:列出应用上下文中所有可用的环境和系统属性变量；
            GET /env/(name)：展现某个特定环境变量和属性变量的值；
            GET /health:展现当前应用的健康状况；
            GET /info：展现应用特定的信息；
            GET /metrics:列出应用相关的指标，包括请求特定端点的运行次数；
            GET /metrics/(name)：展现应用特定指标项的指标状况；
            POST /shutdown：强制关闭应用；
            GET /trace:列出应用最近请求相关的元数据，包括请求和响应头。


    21.5 小结