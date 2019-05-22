a啊啊爱到底
activiti功能实战

现有的maven工程集成activiti
	* pom.xml引入activiti依赖
	* pom.xml引入activiti的spirng集成依赖
	* 在spring的主配置文件里面管理activiti的引擎和提供activiti服务类
	*　测试引擎是否由spring托管成功
	* 定义一个接口 ,接口的实现集中管理activiti提供的服务类,由这个接口统一对外提供activiti的引擎服务
	

第一个功能
	* 设计请假的流程
	* 部署流程 
	* 查看流程部署信息
	* 删除流程部署信息
	
第二个功能
	* 流程定义的查询
	* 流程图的查看
		一般通用的做法有两步:
			a:跳转到查看图片的页面
			b:在页面通过img src="url请求" 获取图片的输出流
第三个功能
	* 请假单的增删改查		
>>>>>>> branch 'master' of https://github.com/zhangxiaomeng11/teest.git
