#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int mon_strlen(char s[]){
	int i=0;

	while(s[i] != '\0')
	{
		i++;

	}

	return i;

}

int mon_strlen2(const char *s){
	int i=0;
		while(*(s+i) != '\0')
	{
		i++;
	}

	return i;

}
int mon_strcmp(const char * s1, const char * s2)
{
	int i=0;
	while(*(s2+i) != '\0' && *(s1+i) != '\0')
	{
		if(*(s1+i) > *(s2+i)){
			return 1; 

		}else if(*(s1+i) < *(s2+i))
		{
			return -1;

		}
		i++;
	}
	return 0;
}
int mon_strncmp(const char * s1, const char * s2, int n)
{
	int i=0;
	char * tmp1;
	tmp1=malloc(sizeof(char)*n);
	char * tmp2;
	tmp2=malloc(sizeof(char)*n);

	while(i != n)
	{
		tmp1[i] = s1[i];	
		tmp2[i] = s2[i];
		i++;
	}
	return mon_strcmp(tmp1,tmp2);

}
char *mon_strcat(char *s1, const char *s2){

	//concaténant la chaîne s2 au bout de la chaîne s1
	char * tmp = malloc(sizeof(char)*(mon_strlen2(s1)+mon_strlen2(s2)));
	int i=0;
	while(i != tmp)
	{
		if(i <=  mon_strlen2(s1))
		tmp[i] = s1[i];

		//TODO
		i++;
	}

}


int main(void)
{
	char sweet[] = "bismillah le matin et le soir quand il fait noir";
	printf("/******************EXO1************/ \n" );
	printf(" size :%d\n",mon_strlen(sweet) );

	char s[] = "starfoullah";

	char t[] = "titi";
	char z[] = "tito";
	printf("/******************EXO2************/ \n" );
	printf(" size : %d\n",mon_strlen2(s));
	printf("/******************EXO3************/ \n" );
	printf("Comparaison : %d \n",mon_strcmp(z,t) );
	printf("Comparaison : %d \n",mon_strcmp(t,z) );
	printf("Comparaison : %d \n",mon_strcmp(t,t) );
	printf("/******************EXO4************/ \n" );
	printf("Comparaison : %d \n",mon_strncmp(s,t,3) );
	printf("Comparaison : %d \n",mon_strncmp(t,s,2) );
	printf("Comparaison : %d \n",mon_strncmp(t,t,3) );
	printf("/******************EXO5************/ \n" );

	return 0;
}