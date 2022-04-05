## Değişken Bildirim Tipleri 
##### Long int Işeret() veya kapsamlarını genişletir. printf kullanacaksak %ld olarak kullanıyoruz.
###### Unsigned int : - aralığı alıp + aralığı verir.%u 
##### Short int : longun tam tersi aralığı daraltıp, boyutu kuçültüyor.
###### Signed :normal durum işaretli halidir. 
##### Unsigned short int : bunu yüzde ,%hu ile yazdırıyoruz
###### Unsigned long int :%lu
##### Long double:%lf
###### Unsigned char %c;
##### ___________________________________________________________________________________________________________________
##### Formal bildirim: fonksiyon paramatetresi olarak tanımlamak formal tanımlamaktır.
##### ANSI standart göre fonksiyon parametresi tanımlamak:
``` 
int fonksiyon(m,n,k)
int m,n;
char k;
{


} 
```

##### ————————————————————————————————————————————————————————
##### Dışsal bildirim: (extern bildirim)
###### A.c dosyası:
###### int x;
###### b.c dosyası:
###### extern int x;

###### c.c dosyası:

##### ________________
#### Statik bildirim:
###### Statik değişkenler normal değişkenler gibi programın yürütülmesi boyunca bellekte yer işgal ederler.ancak genel değişkenler gibi fonksiyonlarca tanınmazlar. Bu tip değişkenler özellikle açılımlarla ilgili veya kütüphaneye koymak amacıyla programcı tarafından yazılan fonksiyonların yazımında yararlıdır.
##### __________________




