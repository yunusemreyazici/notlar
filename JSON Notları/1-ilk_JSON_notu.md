## Json Nedir?
#### Açılımı javaScriptObjectNotation'dur.
#### Json, bir veri değişim formatıdır.
#### Temel amacı XML'e göre daha küçük boyutlarda veri taşımaktır.
#### XML'den daha hızlıdır.
#### Yazım şeklindeki farklardan dolayı XML'den daha az yer kaplar.
## JSON KULLANIM ALANLARI 
#### JavaScript için tasarlanmıştır.
#### ancak günümüzde birçok programlama dili ve platform tarafından kullanılıyor.
#### ÖRN: PHP-.NET-JAVA-....
#### Json ile mobil uygulamalar ve masaüstü yazılımları gibi farklı platformlar arasında veri taşınabilir.
![](./img/jsonVeri.png)
## JSON Veri Tipleri 
#### - String(Metin)
#### - Number(Sayı)
#### - Boolean(true/false)
#### - Array(dizi)
#### - Object (Nesne)
#### - Null
## Json veri yapısı
#### Bilmemiz gerekn şey ; Bir json dosyası süslü parantez ile başlar süslü parantez ile biter.
```
    "isim":"deger",
    "isim":"deger",
    "marka":"Xiaomi", // String türünden değer girerken çift tırnak kullanıyoruz.
    "model":"Redmi 5 Plus",
    "fiyat": "1299, // Sayı türünden bir değer girdiğimiz için çif tırnak koymuyoruz.
    "renk":["siyah","gri","mavi","kırmızı"], // Dizi türünden değer girerken diğer dillerdeki gibi köşeli parantez kullanırız.
    "kamera" : { // Obje türündeki verileri süslü parantez içerisinde saklıyoruz.
        "on" :8,
        "arka": 12.5 //Ondalıklı değerlerde virgül değil nokta kullanıyoruz.
    },
    "stok": true, // bool türünde veri girişi. true yada false olabilir.
    "firma": null // null türünden bir değer girdik.
```
#### Json türünde veri böyle isim değer çiftlerinden oluşuyor ve her isim değer çiftinin arasına bir virgül koymamız gerekiyor. Veri girişimiz bittiğinde sonuncu veri girişinden sonra nokta kullanılmıyor.
### Array Yapısına bakalım..
```
{
    "okul": "marmara üniversitesi",
    "bolum":"Bilgisayar Mühendisliği",
    "donem":"2007-2011",

    "ogrenciler":[ //dizinin başlangıcında diziye bir isim vermemiz gerekir.
        {
            "adsoyad": "Yücel Alkan",
            "numara": 123
        },
        {
            "adsoyad":"Ahmet Balcı",
            "numara": 578
        },
        {
            "adsoyad":"Burak Yılmaz",
            "numara":378
        }
    ]
}
```
#### bakın şuan dosyamızın içerisinde üç tane nesne türünden bir tane de dizi türünden veri bulunmakta.
#### hadi bir dizi daha ekleyelim.
```
{
    "okul": "marmara üniversitesi",
    "bolum":"Bilgisayar Mühendisliği",
    "donem":"2007-2011",

    "ogrenciler":[
        {
            "adsoyad": "Yücel Alkan",
            "numara": 123
        },
        {
            "adsoyad":"Ahmet Balcı",
            "numara": 578
        },
        {
            "adsoyad":"Burak Yılmaz",
            "numara":378
        }
    ],
    "dersler": [
        {
            "dersAdi": "Programlama",
            "saat": 5
        },
        {
            "dersAdi": "Veritabanı",
            "saat":4
        }
    ]
}
```
#### yani şuan dosyamızın içerisinde üç tane nesne türünden veri,iki tane de dizi türünden veri bulunuyor.
#### dizi içerisindeki elemanların hepsi aynı isim değer çiftine sahip olmak zorunda değil.

```
{
    "okul": "marmara üniversitesi",
    "bolum":"Bilgisayar Mühendisliği",
    "donem":"2007-2011",

    "ogrenciler":[
        {
            "adsoyad": "Yücel Alkan",
            "numara": 123,
            "basari":"Okul Birinciliği"
        },
        {
            "adsoyad":"Ahmet Balcı",
            "numara": 578,
            "hastalık":"Astım"
        },
        {
            "adsoyad":"Burak Yılmaz",
            "numara":378
        }
    ],
    "dersler": [
        {
            "dersAdi": "Programlama",
            "saat": 5
        },
        {
            "dersAdi": "Veritabanı",
            "saat":4
        }
    ]
}
```
#### yani dizi içerisindeki elamanların hepsi aynı isim değer çiftine sahip olmak zorunda değil ve genişletilmesi oldukça kolay JSON tercih edilme sebeplerinden biriside aslında bu.
#### Özetleyelim aynı dosyada hem nesne türünden veri tutabiliyoruz hem dizi türünden veri tutabiliyoruz. Bu şekilde JSON kullanımı oldukça kolay.
