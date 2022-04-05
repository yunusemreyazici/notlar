## C hakkında Genel Notlar kısa kısa..

###### - Değişikenlerin Default değerleri olduğu için değişkene sayı ataması yapılmalıdır.(Her derleyici için bu değerler farklı olabilir örneğin dev c++ da int a; tanımlandığı zaman değişkenin değeri 0 olurken vs stdioda değişkenin değeri 1'dir. )
###### pointer: bir değişkenin adresini tutan değişken demektir.
###### << bit düzeyinde sola öteleme
###### >>> bir düzeyinde sağa öteleme 
###### Operatörlerin birbirine öncelikleri vardır. Tıpkı matematikteki gibi 
###### ^ bit düzeyinde yada işareti.
###### & (ampersant) operatörü adresi; * operatörü adresteki anlamındadır.
###### 
##### tür dönüşümleri :  alttaki kodda b'nin içerisine a'yı double çevirip koyduk.
``` 
int a;
double b;

b=(double) a;
```
#### sizeof operatörü
###### - Sizeof iki türlü yazım biçimi var bu operatörün:
######  - Birincisi; sizeof nesne,
###### - Diğeri; sizeof(tip) 
###### Bu operatör bir dizi için kullanılırsa dizinin bellekte kapladığı toplam alanın byte’ını verir.
###### Bu operatör yapısal veritipleri (struct ve union ile bildirilmiş olan) için de kullanılır.
##### Kısa if kullanımı : 
###### koşul?olumlu sonuc:olumsuz sonuc;
##### Örnek Bir tam sayı değişken olan Xin - bir tam sayı olduğunu sorgulayan sorgu.
###### X>0?printf(“x pozitif”):printf(“x negatif”);

