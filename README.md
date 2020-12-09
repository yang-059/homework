# 学号：2020322059 班级：G201 姓名：杨一博 （homework）

# 实验五 模拟学生作业处理

## 实验目的
+ 掌握字符串String及其方法的使用
+ 掌握文件的读取/写入方法
+ 掌握异常处理结构
## 业务内容
+ 在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。
  - 文件A包括两部分内容：
    一是学生的基本信息；
    二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：
    每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
    允许提供输入参数，统计古诗中某个字或词出现的次数
    输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
    考虑操作中可能出现的异常，在程序中设计异常处理程序

    输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>

    输出：
    汉皇重色思倾国，御宇多年求不得。
    杨家有女初长成，养在深闺人未识。
    天生丽质难自弃，一朝选在君王侧。
    回眸一笑百媚生，六宫粉黛无颜色。
    春寒赐浴华清池，温泉水滑洗凝脂。
    侍儿扶起娇无力，始是新承恩泽时。
    云鬓花颜金步摇，芙蓉帐暖度春宵。
    春宵苦短日高起，从此君王不早朝。
    …………
  - 设计程序完成上述的_业务逻辑处理_，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。
## 实验要求：
  - 设计学生类（可利用之前的）；
  - 采用_交互式方式_实例化某学生；
## 实验过程
1. 用Scanner完成交互式信息输入；
2. 用InputStreamReader和BufferedReader语句分别创建基于B.txt文件和学生信息的输入流
3. 用BufferedWriter完成对学生信息和作业内容写入A.txt中；
4. 运行试验文件的转存。
## 核心代码
1. scanner交互式实例化学生
```
      ArrayList<Xuesheng> studentArray = new ArrayList<Xuesheng>();    //定义scanner可输入的学生信息
			Xuesheng a = new Xuesheng();
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入您要查询的字符：");
			wordForSearch=scanner.nextLine();
			System.out.print("请输入姓名：");
```
2. 创建基于文件和信息的输入流
```
InputStreamReader ir =new InputStreamReader(new FileInputStream("D:/B.txt"), "UTF-8");    //创建基于B.txt文件和学生信息的输入流
	       BufferedReader bf = new BufferedReader(ir);
	       String poem=bf.readLine();
	       StringBuffer sb=new StringBuffer();
	       sb.append(poem);
```
3.创建基于文件和信息的输出流
```
          File destPath = new File("D:/A.txt");                                //将信息和作业输出到A.text
	        BufferedWriter bw = new BufferedWriter(new FileWriter(destPath));  
```
## 运行结果
1. 标点位置正确，但未完成换行（对应A.txt文件）
![](https://github.com/yang-059/homework/blob/main/homework运行结果.PNG)
2. 完成加标点及换行操作，但分割有误（对应A（有误）.txt文件）
![](https://github.com/yang-059/homework/blob/main/homework运行结果（有误）.PNG)
## 编程感想
+ 在本次实验中，完成了scanner的交互式实例化和文件或字符的输入输出流；
  - 不足：没能完美达到换行和加标点同时进行，需加以改正。
