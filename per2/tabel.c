#include <stdio.h>
#include "tabel.h"

/*Deskripsi : Algoritma untuk setiap fungsi dan prosedur yang berada di tabel.h*/
/*Pembuat : Daffa Aly Meganendra */
/*Tanggal : 7 September 2023 */

void createTable(Tabel *T) {

  // Kamus Lokal
  int i;

  // Algoritma
  (*T).size = 0;
  for (i = 1; i <= 10; i++) {
    (*T).wadah[i] = -999;
  }

}

void printTable(Tabel T) {
  // Kamus Lokal
  int i;

  // Algoritma
  printf("[");
  for (i = 1; i <= 10; i++) {
    printf(" %d, ", T.wadah[i]);
  }
  printf("]");
}

void viewTable(Tabel T) {
  // Kamus Lokal
  int i;

  // Algoritma
  for (i = 1; i <= 10; i++) {
    if (T.wadah[i] != -999) {
      printf("%d", T.wadah[i]);
    }
  }
}

int getSize(Tabel T) { return T.size; }

int countEmpty(Tabel T) { return 10 - T.size; }

boolean isEmptyTable(Tabel T) { return T.size = 0; }

boolean isFullTable(Tabel T) { return T.size = 10; }

void populate1(Tabel *T, int N) {
  //Kamus Lokal
  int i, user;

  //Algoritma
  for (i = 1; i <= N; i++) {
    scanf("%d", &user);
    if (user > 0 && (*T).size <= 10) {
      (*T).wadah[i] = user;
      (*T).size++;
    }
  }
}

void searchX1(Tabel T, int X, int *Pos) {
  //Kamus Lokal
  int i;
  *Pos = -999;

  //Algoritma
  for (i = 1; i <= T.size; i++) {
    if (T.wadah[i] == X) {
      *Pos = i;
      break;
    }
  }
}

void countX(Tabel T, int X, int *Byk) {
  //Kamus Lokal
  int i;
  *Byk = 0;

  //Algoritma
  for (i = 1; i <= T.size; i++) {
    if (T.wadah[i] == X) {
      (*Byk)++;
    } else {
      continue;
    }
  }
}

int SumEl(Tabel T) {
  //Kamus Lokal
  int i;
  int sum = 0;

  //Algoritma
  for (i = 1; i <= T.size; i++) {
    if (T.wadah[i] != -999) {
      sum += T.wadah[i];
      
    }
  }
  return sum;
}

int AverageEl(Tabel T) {
  //Kamus Lokal
  int i;

  //Algoritma
  if (T.size == 0) {
    return 0;
  }

  return SumEl(T) / T.size;
}

int getMaxEl(Tabel T) {
  //Kamus Lokal
  int i;
  int max = T.wadah[1];

  //Algoritma
  for (i = 2; i <= T.size; i++) {
    if (T.wadah[i] > max) {
      max = T.wadah[i];
    }
  }
  return max;
}

int getMinEl(Tabel T) {
  //Kamus Lokal
  int i;
  int min = T.wadah[1];

  //Algoritma
  for (i = 2; i <= T.size; i++) {
    if (T.wadah[i] < min && T.wadah[i] != -999) {
      min = T.wadah[i];
    }
  }
  return min;
}

void populate2(Tabel *T) { //udh bener jangan di ganti

  //Kamus Lokal
  int i, user;

  //Algoritma
  for (i = 1; i <= 10; i++) {
    scanf("%d",  &user);
    if (user > 0 && (*T).size <= 10) {
      (*T).wadah[i] = user;
      (*T).size ++;
    } else {
      break;
    }
  }
}

void addXTable(Tabel *T, int X) { //udh bener jangan di ganti
  //Kamus Lokal
  int i;

  //Algoritma
  if ((*T).size <= 10) {
    for (i = 1; 1 <= (*T).size; i++) {
      if ((*T).wadah[i] == -999) {
      (*T).wadah[i] = X;
      (*T).size++;
        break;
      }
    }
  }
}

void delXTable(Tabel *T, int X) { //udh bener jangan di ganti
  //Kamus Lokal
  int i, j;

  //Algoritma
  for (i = 1; i <= (*T).size; i ++) {
    if ((*T).wadah[i] == X) {
      for (j = i; j <= (*T).size; j ++) {
        (*T).wadah[j] = (*T).wadah [j + 1];
      }
      j--;
      break;
    }
  }
}

void delAllXTable(Tabel *T, int X) {//udh bener jangan di ganti
  //Kamus Lokal
  int i, j;

  //Algoritma
  for (i = 1; i <= (*T).size; i ++) {
    if ((*T).wadah[i] == X) {
      for (j = i; j <= (*T).size; j ++) {
        (*T).wadah[j] = (*T).wadah [j + 1];
      }
      i--;
    }
  }
}

int Modus(Tabel T) {

  //Kamus Lokal

    int count[11] = {0};
    int i, temp;
    int modus = -999;
    int maxCount = 0;

  //Algoritma
    for (i = 1; i <= T.size; i++) {
        temp = T.wadah[i];
        count[temp]++;
    }


    for (i = 1; i <= 10; i++) {
        if (count[i] > maxCount) {
            maxCount = count[i];
            modus = i;
        }
    }

    return modus;
}