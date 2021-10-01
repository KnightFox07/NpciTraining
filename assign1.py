s=5
list=[]
list2=[]
list3=[]
count=0
num=1
sum=0
temp=1
m=2*s - 2
for i in range(0,s):
    for j in range(0,m):
        print(end=' ')
    m=m-1
    num=temp
    sum=0
    for j in range(0,i+1):
        print(num,end=' '),
        list2.append(num)
        sum=sum+num
        num+=1       
    print('\n')
    list3.append(list2[:])
    list2.clear()
    list.append(sum)  
    temp+=3
    print()

##################################################################

print("2nd output-################################################################# \n")
for i in range(len(list)):
    print("The sum of "+str(i+1)+" row  is : "+str(list[i]))
print("\n")

#################################################################
print("3rd output-################################################################# \n") 


list3.reverse()

for i in range(0,len(list3)):
    cal=5-len(list3[i])
    for j in range(0,len(list3[i])):
        print(str(list3[i][j])+",",end=''),
    for j in range(0,cal):
        print(0,end=' '),

    print("\n") 

#########################################################
print("4th output-################################################################# \n") 

for i in range(0,len(list3)):
    cal=5-len(list3[i])
    for j in range(0,len(list3[i])):
        print(str(list3[i][j]*list3[i][j])+",",end=''),
    for j in range(0,cal):
        print(0,end=' '),

    print("\n")



