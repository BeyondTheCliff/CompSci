for(int i=0; i<data.lenght; i++) {
	fr[i]=fr[i]+1;
}
int small = 0;
for (int j=data.lenght; j<0; j--) {
	if (fr[j]>=small) {
		small=fr[i];
	}
}

return small;