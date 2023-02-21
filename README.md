# Enoca Homework

1. Soru : MVC kavramını açıklar mısınız ? Neden ihtiyaç duyuluyor. Java’da nasıl kurgulanıyor.
Object Oriented katmanları nelerdir ?

Cevap 1: MVC, 
Model, View ve Controller kelimelerinin baş harflerinden oluşmaktadır.
MVC deseni, 3 katmandan oluşmaktadır ve katmanları birbirinden bağımsız olarak çalışmaktadır. 
Bu sebeple çoğunlukla büyük çaplı projelerde projelerin yönetiminin ve kontrolünün daha rahat sağlanabilmesi için tercih edilmektedir.
Java da şu şekilde kurgulanabilir (entity - repository - service - controller).

### OOP birçok özelliği vardır. Bunları 4 temel özellikte inceleyebiliriz.

* [Soyutlama (Abstraction)](#)
* [Kapsülleme (Encapsulation)](#)
* [Miras Alma (Inheritance)](#)
* [Çok Biçimlilik (Polymorphism)](#)


2. Soru : Birbirinden bağımsız iki platformun birbiriyle haberleşmesi nasıl sağlanabilir. Örneğin, X
platformu Java ile yazılmış olsun, Y platform u C# ile. Bu iki platformun bir biri ile iletişim
halinde request-response ilişkisi kurması gerekiyor. Bu yapıyı nasıl sağlarız.

Cevap 2: API'nin açılımı olan Application Programming Interface,
iki yazılım bileşeninin belirli tanımlar ve protokoller aracılığıyla 
birbiriyle iletişim kurmasına olanak tanıyan mekanizmalardır.
İlişkili API belgeleri, geliştiricilerin bu istek ve yanıtları 
nasıl yapılandırması gerektiğine dair bilgiler içerir. (JSON veya XML)

3. Soru : Bir web sayfasında ekran sürekli Backend’ den veya bir başka yapı tarafından
güncelleniyor. Siz, web sayfasını refresh etmeden bu güncel bilgiyi anlık ekrana nasıl yansıtırsınız.

Cevap 2: Soket bilgisayarlar arası veri haberleşmesinde kullanılır.

WebSocket protokolü, sunucuya ve sunucudan gerçek zamanlı veri aktarımını sağlayarak, tarayıcı ile web sunucusu arasında etkileşimi sağlamaktadır. 
Bu, sunucunun istemci istemeden tarayıcıya içerik gönderebileceği ve bağlantıyı açık tutarak istediği zaman mesaj alabilmesini veya gönderebilmesini 
sağlayan standart bir yöntem ile sağlanmaktadır. Bu şekilde, tarayıcı ile sunucu arasında iki yönlü devam eden bir iletişim gerçekleşebilmektedir.

4. Soru: Bir for döngüsü ile aşağıdaki çıktıyı yazar mısınız.

Cevap 4: class HelloWorld {
public static void main(String[] args) {

        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                String str = "*";
                if(j<2){
                    System.out.print(str);
                }else if(j>=2){
                    System.out.print(str.repeat(2));    
                }
                
            }
            System.out.println();
        }
        
    }
}

5. Soru: Firmada çalışman için sana remote bir linux server verildi. Elinde ip adresi port bilgisi
   kullanıcı adi ve şifren var. Server a erişimi nasıl test edersin, Server a nasıl erişirsin, Server a
   nasıl dosya atarsın, Serverdan nasıl dosya çekersin.

Cevap 5 : SSH, Secure Shell protokolünün kısaltmasıdır. Bir bilgisayar ile uzak bir bilgisayar arasında güvenli bir bağlantı kurulum yapılmasını sağlayan bir ağ protokolüdür. 
SSH protokolü ile birlikte bir kişi, bağlanacağı uzak sunucuya erişim sağlaması durumunda sunucu için de istediği şekilde yönetimi sağlayabilir.
SSH protokolü ile sunucuya bağlanmanız durumunda sunucu içerisindeki tüm dosya, uygulama gibi sunucunun tamamında bir yönetime sahip olursunuz.

6. Soru : Java spring uygulaması ile CRUD webservisi geliştirilmesi.

Tech Stack:

* [Spring Boot](#)  [Spring DataJpa](#)
* [H2 Database](#) [Git](#)
* [Java 8](#) [Docker](#)

### Project run

We can run two different ways:

### with Docker

1. docker run --name enoca-task -p 8080:8080 abbas1997/enoca
2. this my image you can run : docker run --name enoca -p 8080:8080 abbas1997/enoca

### with Maven

1. go to this github adress git clone https://github.com/AbbasSAFAROV/enoca-task
2. mvn clean install
3. mvn springboot:run

> `http://localhost:8080` will run that port

## HTTP Client Structure

|       Controller       | Metot  |            Adres             |            Description             |
|:----------------------:| :----: |:----------------------------:|:----------------------------------:|
| **EmployeeController** |  GET   |   localhost:8080/employees   |      Will List All employees       |
|                        |  GET   |  localhost:8080/employees/1  |    will get employee with id:1     |
|                        |  POST  |   localhost:8080/employees   |          create employee           |
|                        |  PUT   |  localhost:8080/employees/1  |   will update employee with id:1   |
|                        | DELETE |  localhost:8080/employees/1  |   will delete employee with id:1   |
| **CompanyController**  |  GET   |   localhost:8080/companies   |      Will List All companies       |
|                        |  GET   | localhost:8080/companies/1   |     will get company with id:1     |
|                        |  POST  |   localhost:8080/companies   |           create company           |
|                        |  PUT   |  localhost:8080/companies/1  |    will update company with id:1   |
|                        | DELETE |  localhost:8080/companies/1  |   will delete company with id:1    |


7. Soru : Apache Solr servisine yazılacak bir query örneği Apache Solr kullanılan sql
   programlarından daha farklı runtime bir database. Solr a hali hazırda kayıtlı bir alan olduğunu
   düşünelim. Alanın ismi “updatedAt” long tipinde tutulan bir alan. Ben 2020 Ocak ayından
   sonraki verileri getir dediğimde solr a nasıl bir query yazılmalı. http://example?query=
   kısmını nasıl doldurmalıyım?

Cevap 7: http://example?query=updatedAt:[2020-01-01T00:00:00Z TO NOW]
