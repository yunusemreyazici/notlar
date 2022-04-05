#### Fonksiyonlar Hakkında kısa kısa notlar..
###### - Fonksiyonlar mainde çağırılmazsa yürütülmezler.
###### - Örnek bir fonksiyon böyle yazılır.

``` 
alanHesapla(){


 }
```
###### - Fonksiyon önüne geri dönüş tipine göre veritipi atanır.(Double,int,void vs..)
###### - geri dönüşsüz bir fonksiyonsa void olarak tanımlanmalıdır.
###### - Örnek:
``` 
void geriDonumsuzFonksiyon(){

 }
```
###### Fonksiyonlar mainde çağırılmazsa yürütülmezler.
###### Ayrıca C'de preinclude etmek gerekir fonksiyonları örneğin terstoplam.c dosyasına bakılabilir. mainin üstünde fonksiyon tekrar tanımlanmalıdır yani...
```ckodu
#include <stdio.h>
double tersToplam(int mdegeri, int ndegeri);
int main(int argc, char const *argv[])
{
    int mdegeri, ndegeri;

    printf("m degeri giriniz... :");
    scanf("%d", &mdegeri);
    printf("n degeri giriniz... :");
    scanf("%d", &ndegeri);

    printf("%lf", tersToplam(mdegeri, ndegeri));

    return 0;
}

double tersToplam(int mdegeri, int ndegeri)
{
      int swapci;
    double dondurucu;
    if (mdegeri > ndegeri) // ilk argumanin kucuk olmasi gerkir. kucuk degilse yer degisim swap islemine tabi tutulur.
    {
        swapci = mdegeri;
        mdegeri = ndegeri;
        ndegeri = swapci;
    }
    if (mdegeri < 0 && ndegeri > 0)
    {
        mdegeri *= (-1);
        if (mdegeri > ndegeri)
        {
            swapci = mdegeri;
            mdegeri = ndegeri;
            ndegeri = swapci;
            for (int i = mdegeri + 1; i <= ndegeri; i++)
            {
                if (i != 0)
                {
                    dondurucu += -(1 / (double)i);
                }   
            }
        }
        else
        {
            for (int i = mdegeri + 1; i <= ndegeri; i++)
            {
                if (i != 0)
                {
                    dondurucu += (1 / (double)i);
                }
            }
        }
    }
    else // buyuk ifin elsesi yani ikisininde + olduğu durum. veya her ikisininde eksi olduğu durum
    {
        for (int i = mdegeri; i <= ndegeri; i++)
        {
            if (i != 0)
            {
                dondurucu += (1 / (double)i);
            }
        }
    }
    return dondurucu;
}
```


