package com.qianrui.a08regexdemo8;

public class Regex {
	public static void main(String[] args) {
        /*

        API:Pattern
        正则表达式：
            字符类(只匹配一个字符)                                预定义字符(只匹配一个字符)
        [abc]               只能是a,b,c                    .           任何字符
        [^abc]          除了a,b,c之外的任何字符             \d          一个数字:[0-9]
        [a-zA-Z]         a到z A到Z,包括(范围)              \D          非数字:[^0-9]
        [a-d[m-p]]        a到b,或m到p                      \s          一个空白字符:[\t\n\x0B\f\r]
        [a-z&&[def]]      a-z和def的交集.为d,e,f           \S          非空白字符:[^\s]
        [a-z&&[^dc]]      a-z和非bc的交集.(等同于[ad-z])    \w          英文、数字、下划线:[a-zA-Z_0-9]
        [a-z&&[^m-p]      a到z和除了m到p的交集.             \W          一个非单词字符[^\w]
                            (等同于[a-lq-z])




            数量词
         X?             X,一次或0次
         X*             X,零次或多次
         X+             X,一次或多次
         X{n}           X,正好n次
         X{n,}          X,至少n次
         X{n,m}         X,至少n次但不超过m次


         正则表达式小结：
         符号             含义                      举例
         []         里面的内容出现一次           [0-9]   [a-zA-Z0-9]
         ()             分组                        a(bc)+
         ^              取反                      [^abc]
         &&         交集,不能写单个的&             [a-z&&m-p]
         |          写在括号外面表示并集           [a-c]|[c-z]   x|X
         .              任意字符                \n回车符号不匹配
         \              转义字符                     \\d
         \\d             0-9                        \\d+
         \\D            非0-9                        \\D+
         \\s            空白字符                [\t\n\x0B\f\r]
         \\S           非空白字符                    [^\s]
         \\w            单词字符                [a-zA-Z_0-9]
         \\W           非单词字符                    [^\w]
         ?             0次或1次                    \\d?
         *             0次或多次                    \\d* (abc)*
         +             1次或多次                    \\d+ (abc)+
         {}            具体次数                 a{7}    \\d{7,19}
         (?!)       忽略后面字符的大小写              (?!)abc
         a((?!)b)c   只忽略b的大小写


         //正则表达式在字符串方法中的使用
                        方法名                                                     说明
         public string[] matches(String regex)                        判断字符串是否满足正则表达式的规则
         public String replaceAll(String regex,String newStr)         按照正则表达式的规则进行替换
         public String[] split(String regex)                          按照正则表达式的规则切割字符串
         */
	}
}
