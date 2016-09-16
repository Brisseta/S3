
#include <stdio.h>
#include <stdlib.h>
#include <time.h>




void generationalea(int tab[] , int taille)
{
	int random;
	int i;
	for ( i = 0; i < taille; ++i)
	{
		random = rand();
		tab[i]=random;
	}

}

void afficher(int liste[], int taille)
{
	int i;
	for ( i = 0; i < taille; ++i)
	{
		printf(" %d , ",liste[i]);
	}
	printf("\n");

}

int somme (int liste[], int taille)
{
	int somme=0;
	int i;
	for ( i = 0; i < taille; ++i)
	{
		somme += liste[i];
	}

	return somme;

}

void copie_dans(int dest[], int src[], int taille)
{
	int i;
	for ( i = 0; i < taille; ++i)
	{
		dest[i] = src[i];
	}
}
void ajoute_apres(int dest[], int taille_dest, int src[], int taille_src)
{
    //ne marche pas !!!
	int indice_insert;
	int cpt=0;
    for(indice_insert=taille_dest+1;indice_insert <= taille_src ; ++indice_insert)
    {
        dest[indice_insert]=src[cpt];
        ++cpt;
    }
}
struct rat
{
    int den;
    int num;
};
struct rat rat_produit(struct rat n1, struct rat n2)
{
    struct rat tmp;
    tmp.den = n1.den * n2.den;
    tmp.num = n1.num * n2.num;

    return tmp;
};
struct rat rat_somme(struct rat n1, struct rat n2)
{
    struct rat tmp;
    tmp.den = n1.den * n2.den;
    tmp.num = (n1.num * n2.den) + (n2.num * n1.den);

    return tmp;
};
struct rat rat_plus_petit(struct rat list[],int taille)
{
    struct rat min=list[0];
    int i;
    for(i=0;i< taille; ++i)
    {
        struct rat tmp=list[i];
        /*if(tmp.dem > min.den)
        {
            min = list[i];
        }
        */
        else if(tmp].den == min.den)
        {
            if(tmp.num < min.num)
            {
                min = list[i];
            }
        }
    }
    return min;
};

int main(void)
{
    int exemple[]={1,5,8,9,54,65,87,78,9,8,7};
    int tmp[11];
    int tmp2[11+11];
    printf("Somme : %d \n",somme(exemple,11));
    copie_dans(tmp,exemple,11);
    afficher(tmp,11);
    afficher(exemple,11);
    copie_dans(tmp2,tmp,11);//on copie dans tmp2
    ajoute_apres(tmp2,11,exemple,11);//todo
    afficher(tmp2,22);
	return 0;
}
