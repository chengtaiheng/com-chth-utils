.PHONY: deploy # 声明deploy是伪目标，不是文件名，不用检查是否已有deploy这个文件
.RECIPEPREFIX = > #声明用>代替tab键

#在执行make命令时，会默认先输出里面的具体命令（这个叫做回声），要想关掉回声在每条命令前加上一个@符（有空格的）；

#make脚本里面用等号定义变量,取变量时用$(变量名)调用
text = hello,world

deploy :
> @ mvn clean install deploy -X -Dmavn.test.skip=true

test :
> @ echo $(text)