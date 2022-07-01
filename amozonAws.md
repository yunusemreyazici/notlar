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
sudo apt update && sudo apt upgrade

screen -ls
screen -d 
screen -r

nano 
wget
touch
nano
apt install paket_adi

```

- PHP 8.0,MySql ve Wordpress kurulumu:
```
sudo apt install apache2
sudo apt install mysql-server

sudo apt install ca-certificates apt-transport-https software-properties-common
sudo add-apt-repository ppa:ondrej/php
sudo apt install php8.0 libapache2-mod-php8.0 
sudo apt install php8.0-fpm libapache2-mod-fcgid
sudo a2enmod proxy_fcgi setenvif

systemctl restart apache2
sudo a2enconf php8.0-fpm
systemctl reload apache2

apt install php8.0-mbstring
apt install php8.0-gd
apt install php8.0-intl
apt install php8.0-xml
apt install php8.0-xmlrpc
apt install php8.0-mysql
apt install php8.0-curl
apt install php8.0-zip
apt install php8.0-imagick

sudo a2enmod rewrite
sudo /etc/init.d/apache2 restart

rm /var/www/html/index.html
php -v
sudo vim /var/www/html/info.php

sudo apt install phpmyadmin
sudo ln -sf /usr/share/phpmyadmin /var/www/html/phpmyadmin
sudo /etc/init.d/apache2 restart

mysql -u root -p



sudo a2enmod rewrite
sudo /etc/init.d/apache2 restart
cd /tmp
curl -O https://tr.wordpress.org/latest-tr_TR.tar.gz
tar xzvf latest-tr_TR.tar.gz
touch /tmp/wordpress/.htaccess
chmod 660 /tmp/wordpress/.htaccess
cp /tmp/wordpress/wp-config-sample.php /tmp/wordpress/wp-config.php
mkdir /tmp/wordpress/wp-content/upgrade
sudo cp -a /tmp/wordpress/. /var/www/html
sudo find /var/www/html -type d -exec chmod g+s {} \;
sudo chmod g+w /var/www/html/wp-content
sudo chmod -R g+w /var/www/html/wp-content/themes
sudo chmod -R g+w /var/www/html/wp-content/plugins
curl -s https://api.wordpress.org/secret-key/1.1/salt/
cd /var/www/html
nano wp-config.php

``` 