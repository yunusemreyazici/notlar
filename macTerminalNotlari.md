## Mac Terminal Notları
#### pwd // bulunulan dizini gösterir.
#### cd .. // istenilen dizine gider.
#### touch // dosya oluşturur.
#### ls  // dizindeki dosyaları listeler.

### - Mac Terminalde C kodu derleme 
#### (hello.c yazan yere kendi c kodunuzun dosya adını yazmalısınız....)
#### gcc -o runme hello.c
#### ./runme     

## Mac'lerde path ekleme 
#### echo $SHELL //terminale girdikten sonra hangi shell kullandığınızı bulun m1 ise zsh olur bu ve ben buna göre anlatacağım.
#### nano $HOME/.zprofile //açın dosyayı
#### export PATH="$PATH:[eklemek istediğiniz path]" // yeni satıra girin
#### export PATH="$PATH:$HOME/FlutterDev/flutter/bin" // örneğin flutter pathım benim bu şekilde.
#### contol+x ile y enter diyip saveleyin. terminali kapatıp açtığınızda pathleriniz tanınacaktır.

## Macports yükleme 
#### 1- Xcode Yükleyin.
#### sudo xcodebuild -license
#### xcode-select --install
#### Macports dmg uzantılı paketi yükleyin.
##### sudo port -v selfupdate //ile macports güncellemelerini kontrol edin.
##### Macports'unuz hazır.

### Putty for M1 macbook yükleme
#### Download and install XQuartz
#### sudo port -v selfupdate
#### Type this command sudo port install putty
#### Type Putty into the terminal