a=[]
l=[]
n=int(input('Enter size: '))
k=int(input('enter k: '))
for i in range(0,n,1):
	a.append(int(input()))

l=a[:k]

for j in l:
		a.append(j)
print(a[k:])
