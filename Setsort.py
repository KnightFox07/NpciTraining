st={4,7,5,9,3,6,9,7}

number=list(st)
for i in range(len(number)):
  for j in range(i+1,len(number)):
    if number[i]<number[j]:
      number[i],number[j]=number[j],number[i]
print(number)