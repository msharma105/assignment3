import re
inputFile=open (r"InputFile.txt","r")
str=inputFile.read().replace('\n', '');
print(str)
regex='(http[s]?://([a-zA-Z0-9]+\.)+[a-zA-Z]+(/[a-zA-Z0-9]*)+)'
x = re.findall(regex,str,re.DOTALL)
x = [tuple(j for j in i if j)[0] for i in x]
print(x)
inputFile.close()
