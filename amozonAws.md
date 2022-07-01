## Amazon aws ve diğer linux,ubuntu notlaro

- Ubuntu 18.04 instance aldığınızı kabul ederek başlıyorum.
- Security groupslardan tüm portlara açmanızı öneririm.
- .pem uzantılı erişim anahtarınız da bilgisayarınıda mevcut olmalı instance oluşturuken indirmiş olmalısınız.
- Ben MacOs işletim sistemi kullanmaktayım.Yazımın tamamı MacOs işletim sisteminde kullandığım clientler ile anlatım yapacağım.
- SSH Client olarak terminali kullanıyorum,FTP istemcisi olarakda Transmit adlı uygulama çok başarılı kullanmanızı öneririm.
- Terminali açın ve çalıştığınız folder'a .pem uzantılı server'a bağlanırken kullanacağımız key dosyamızı atın.
- .pem dosyamızı okumak için gerekli izini veriyoruz.
```
chmod 400 yuem2.pem
```
- Alttaki komutla ben kendi makineme bağlanıyorum. Direk copy paste yapmak isterseniz aws sitesinden instance seçip connect with ssh client derseniz kodları direk size verecektir.
```
ssh -i "yuem2.pem" ubuntu@ec2-35-156-208-112.eu-central-1.compute.amazonaws.com
```
- Serverımıza başarılı bir şekilde bağlandık.
- İlk komut ile ubuntu userından root userına geçiş yaptık. Daha sonra FTP'de ubuntu kullanıcısını kullanacağımız için ubuntu userına root yetkileri verdik.
```
sudo su
sudo adduser ubuntu root
```
- Şimdi isterseniz herşey hazır hale gelmeden sistem güncellemelerini yapalım.
```
sudo apt update && sudo apt upgrade
```
- Bu işlem biraz uzun sürebilir,bittikten sonra Transmit uygulamamızı açıp IP adresi ile ilgili server'ı ekleyip key dosyamızı gösterelim. user olarak ubuntu seçin.
- İşte her şey için hazırsınız. Sunucuyu istediğiniz şekilde kullanmanın keyfini çıkarın.

#### Diğer ubuntu komutları
```

```