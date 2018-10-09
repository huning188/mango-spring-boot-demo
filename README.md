
spring-boot-2.0.5.RELEASE 添加mango-spring-boot-starter报错

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.5.RELEASE)

2018-10-10 00:44:07.592  INFO 3032 --- [           main] c.e.demo.MangoSpringBootDemoApplication  : Starting MangoSpringBootDemoApplication on WIN-20180318KNA with PID 3032 (C:\Users\Administrator\Desktop\mango-spring-boot-demo\target\classes started by Administrator in C:\Users\Administrator\Desktop\mango-spring-boot-demo)
2018-10-10 00:44:07.602  INFO 3032 --- [           main] c.e.demo.MangoSpringBootDemoApplication  : No active profile set, falling back to default profiles: default
2018-10-10 00:44:07.755  INFO 3032 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@6646153: startup date [Wed Oct 10 00:44:07 CST 2018]; root of context hierarchy
2018-10-10 00:44:09.468  WARN 3032 --- [           main] o.s.c.a.ConfigurationClassEnhancer       : @Bean method MangoAutoConfiguration.autoCreator is non-static and returns an object assignable to Spring's BeanFactoryPostProcessor interface. This will result in a failure to process annotations such as @Autowired, @Resource and @PostConstruct within the method's declaring @Configuration class. Add the 'static' modifier to this method to avoid these container lifecycle issues; see @Bean javadoc for complete details.
2018-10-10 00:44:09.597 ERROR 3032 --- [           main] com.zaxxer.hikari.HikariConfig           : Failed to load driver class com.mysql.jdbc.Driver from HikariConfig class classloader sun.misc.Launcher$AppClassLoader@6d06d69c
2018-10-10 00:44:09.620  INFO 3032 --- [           main] o.j.m.p.s.starter.MangoDaoAutoCreator    : trnas package[com.example.demo.dao] to locationPattern[classpath*:com/example/demo/dao/**/*Dao.class]
2018-10-10 00:44:09.620  INFO 3032 --- [           main] o.j.m.p.s.starter.MangoDaoAutoCreator    : trnas package[com.example.demo.dao] to locationPattern[classpath*:com/example/demo/dao/**/*DAO.class]
2018-10-10 00:44:09.749  INFO 3032 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'com.example.demo.dao.IPersonDao' of type [org.jfaster.mango.plugin.spring.DefaultMangoFactoryBean] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2018-10-10 00:44:10.697  INFO 3032 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2018-10-10 00:44:10.751  INFO 3032 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2018-10-10 00:44:10.752  INFO 3032 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.34
2018-10-10 00:44:10.768  INFO 3032 --- [ost-startStop-1] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [C:\Program Files\Java\jre1.8.0_152\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:/Program Files/Java/jre1.8.0_152/bin/server;C:/Program Files/Java/jre1.8.0_152/bin;C:/Program Files/Java/jre1.8.0_152/lib/amd64;C:\ProgramData\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;%GRADLE_HOME%\bin;C:\Program Files\Git\cmd;C:\Program Files (x86)\MySQL\MySQL Server 5.5\bin;C:\Program Files\nodejs\;;C:\Program Files\Microsoft VS Code\bin;C:\Users\Administrator\AppData\Roaming\npm;E:\ANING\PROGRAM\sts-3.9.4.RELEASE;;.]
2018-10-10 00:44:10.971  INFO 3032 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2018-10-10 00:44:10.971  INFO 3032 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 3221 ms
2018-10-10 00:44:11.096  INFO 3032 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Servlet dispatcherServlet mapped to [/]
2018-10-10 00:44:11.105  INFO 3032 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2018-10-10 00:44:11.105  INFO 3032 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2018-10-10 00:44:11.106  INFO 3032 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2018-10-10 00:44:11.106  INFO 3032 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2018-10-10 00:44:11.325  INFO 3032 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-10-10 00:44:11.636  INFO 3032 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@6646153: startup date [Wed Oct 10 00:44:07 CST 2018]; root of context hierarchy
2018-10-10 00:44:11.766  INFO 3032 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2018-10-10 00:44:11.768  INFO 3032 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2018-10-10 00:44:11.816  INFO 3032 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-10-10 00:44:11.816  INFO 3032 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-10-10 00:44:12.051  WARN 3032 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'org.jfaster.mango.operator.Mango': Initialization of bean failed; nested exception is org.jfaster.mango.plugin.spring.exception.MangoAutoConfigException: Does not exist master datasource
2018-10-10 00:44:12.052  INFO 3032 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown
2018-10-10 00:44:12.058  INFO 3032 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2018-10-10 00:44:12.086  INFO 3032 --- [           main] ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2018-10-10 00:44:12.095 ERROR 3032 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'org.jfaster.mango.operator.Mango': Initialization of bean failed; nested exception is org.jfaster.mango.plugin.spring.exception.MangoAutoConfigException: Does not exist master datasource
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:581) ~[spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:495) ~[spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:317) ~[spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:222) ~[spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:315) ~[spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:759) ~[spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:869) ~[spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:550) ~[spring-context-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:140) ~[spring-boot-2.0.5.RELEASE.jar:2.0.5.RELEASE]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:780) [spring-boot-2.0.5.RELEASE.jar:2.0.5.RELEASE]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:412) [spring-boot-2.0.5.RELEASE.jar:2.0.5.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:333) [spring-boot-2.0.5.RELEASE.jar:2.0.5.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1277) [spring-boot-2.0.5.RELEASE.jar:2.0.5.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1265) [spring-boot-2.0.5.RELEASE.jar:2.0.5.RELEASE]
	at com.example.demo.MangoSpringBootDemoApplication.main(MangoSpringBootDemoApplication.java:14) [classes/:na]
Caused by: org.jfaster.mango.plugin.spring.exception.MangoAutoConfigException: Does not exist master datasource
	at org.jfaster.mango.plugin.spring.starter.MangoDaoAutoCreator.configMangoDatasourceFactory(MangoDaoAutoCreator.java:155) ~[mango-spring-boot-starter-2.0.1.jar:2.0.1]
	at org.jfaster.mango.plugin.spring.starter.MangoDaoAutoCreator.postProcessAfterInitialization(MangoDaoAutoCreator.java:270) ~[mango-spring-boot-starter-2.0.1.jar:2.0.1]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyBeanPostProcessorsAfterInitialization(AbstractAutowireCapableBeanFactory.java:431) ~[spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1703) ~[spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:573) ~[spring-beans-5.0.9.RELEASE.jar:5.0.9.RELEASE]
	... 15 common frames omitted

