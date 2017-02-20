# Student's Makefile for CSCI 2121 Lab 1: Bit Slinging.

CC = gcc
CFLAGS = -O -Wall

lab1: lab1.c decl.c testFramework.c tests.c testFramework.h lab1.h
	./labCheck lab1.c
	$(CC) $(CFLAGS) -o lab1 lab1.c decl.c tests.c testFramework.c

debug: lab1.c decl.c testFramework.c tests.c testFramework.h lab1.h
	$(CC) $(CFLAGS) -g -o lab1 lab1.c  decl.c tests.c testFramework.c

clean:
	rm -f *.o lab1
