# Ces cibles ne sont pas des vrais fichiers
.PHONY: clean, install, real-clean

# On désactive toutes les règles implicites
.SUFFIXES:

 # Déclarations de constantes
CC = gcc
CFLAGS = -Werror -W -Wall
LD = gcc
SRC=$(wildcard *.c)
	OBJ=$(SRC:.c=.o)

prog : $(OBJ)
	$(LD)  -o $@ $^

# Règle générique : 
%.o: %.c
	$(CC) $(CFLAGS) -c -o $@ $^

clean:
	rm -f *.o
 # Appel récursif à make avec ce Makefile
real-clean:
	make clean
	rm -rf prog