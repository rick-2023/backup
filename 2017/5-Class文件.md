##深入class文件结构

###1.与类相关的指令
.source 代码的源文件

.class 这个类

.super 父类


###常量池
每个常量使用3个字节 byte byte byte
					
				常量类型   常量池索引地址

12种类型的常量：UTF8，Integer,Float,Long,Double,Class,String,Fieldref,Methodref,Interface Methodref,NameAndType;

- utf8常量类型01：前面两个字节表示后面所存储的字符串的总字节数

- filedref常量类型09: 描述class中的属性项与方法。属于哪个类，常量的name和type;methodref 10

- class常量类型07：class常量表示的是该类的名称，并指向另外一个utf8类型的常量的索引；

- NameAndType常量类型0c：为表示method和fieldref的名称和类型描述做进一步说明而存在。名称通常由utf8常量类型来表示，类型描述也由utf8来描述。

###类信息
关于这个类本身的信息描述，访问控制，名称和类型以及是否有父类或是实现了某些接口的信息。

- 对类的访问修饰 1--是否public,5--是否final,6--s是否含有invokespecial 是否继承其他类,10--是否是接口类0否,12--是否是抽象类

###Fields和Method定义
### javap 生成class文件结构
- LineNumberTable line a:b--a 这个方法中的一行的代码在这个类文件中的第几行；b这个代码的第一个jvm指令的pc偏移量。

- LocalVariableTable 5个属性：Start,Length,Slot,Name,Signature; 
 