n=int(input('Enter The Size: '))
print('Enter The Elements: ')
a=[]
OC=0
EC=0
for i in range(0,n):
	a.append(int(input()))
for i in a:
	if i%2==0:
		 EC+=1
	else:
		OC+=1

print('Total Even Numbers In a List: ',EC)
print('Total Odd Numbers In a List: ',OC)
