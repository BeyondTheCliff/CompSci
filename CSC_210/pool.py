import random
from multiprocessing import Pool

def piProcess(tot):
	tot = 1000000
	rad = 10000000000
	count = 0
	for i in range(0,tot):
		x=random.randrange(0,rad)
		y=random.randrange(0,rad)
		count=count+int(x*x+y*y<=rad*rad)
	return count

if __name__ == '__main__':
	numTot = 1000000
	argsL = [numTot,numTot,numTot,numTot,numTot,numTot,numTot,numTot]
	p = Pool(16)
	out = p.map(piProcess,argsL)
	c=0
	for i in out:
		c=c+i
	print((c*4.0)/(numTot*len(argsL)))