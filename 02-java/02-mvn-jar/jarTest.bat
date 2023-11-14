rem 	使用maven模板建立jar项目
rem	mvn archetype:generate		--按照模板建立项目结构
rem	-DgroupId={project-packaging}	--项目包的名称
rem	-DartifactId={project-name}	--项目名称
rem	-DarchetypeArtifactId=maven-archetype-qiuckstart	--qiuckstart是通用jar
rem	-DinteractiveMode=false		--不采用交互模式的方式
rem

mvn archetype:generate -DgroupId=org.kasihappy.Tutorial -DartifactId=jarTest -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false