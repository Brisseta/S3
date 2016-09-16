
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
	int indice_insert;
	




}


int main()
{
	
	return 0;
}