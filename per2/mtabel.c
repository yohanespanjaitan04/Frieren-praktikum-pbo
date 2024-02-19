#include <stdio.h>
#include "tabel.h"
#include "tabel.c"
#include "boolean.h"
/*Deskripsi : driver ADT tabel integer*/
/*Pembuat : Daffa Aly Meganendra */
/*Tanggal : 7 September 2023 */

int main() {
  /*kamus*/
  

  /*algoritma*/
  Tabel T;
  int Y;
  int X;
  createTable(&T);


  //Algoritma Populate1
  // populate1(&T, 8);
  
  // Algoritma Populate2
  populate2(&T);
  
  //Algoritma searchX1
  searchX1(T, 4, &X);
  printf("\n Posisi X berada di indeks ke %d \n", X);
  
  //Algoritma countX
  countX(T, 5, &Y);
  printf(" Banyaknya nilai X: %d \n", Y);
  
  //Algoritma sumEl
  SumEl(T);
  printf(" Jumlah isi tabel: %d \n", SumEl(T));
  
  //Algoritma AverageEl
  AverageEl(T);
  printf(" Rata - rata: %d \n", AverageEl(T));

  //Algoritma getMinEl
  getMinEl(T);
  printf(" Min: %d \n", getMinEl(T));
  
  //Algoritma getMaxEl
  getMaxEl(T);
  printf(" Max: %d \n", getMaxEl(T));
  

  
  //Algoritma addXTable
  addXTable(&T, 9);
  
  //Algoritma delXTable
  delXTable(&T, 9);

  
  //Algoritma delAllXTable
  delAllXTable(&T, 2);

  
  //Algoritma Modus
  printf(" Modus: %d \n", Modus(T));

  printTable(T);
}
