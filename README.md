# Enoca Homework

### 1. Soru : MVC kavramını açıklar mısınız ? Neden ihtiyaç duyuluyor. Java’da nasıl kurgulanıyor. Object Oriented katmanları nelerdir ?

**Cevap**

MVC mimarisi, uygulamanın farklı katmanlarını birbirinden bağımsız hale getirerek daha esnek ve yeniden kullanılabilir bir yapı oluşturmayı hedefler. Bu sayede, uygulamanın farklı katmanları kolaylıkla değiştirilebilir, güncellenebilir veya yeniden kullanılabilir.
Java'da MVC kurgusu, genellikle Spring Framework kullanılarak sağlanır.

Spring MVC, uygulamanın farklı katmanlarını birbirinden ayırarak, model-view-controller mimarisini sağlar. Bu sayede, uygulama daha esnek ve yeniden kullanılabilir bir yapıya sahip olabilir.
Object-oriented katmanlar ise, bir uygulamanın farklı parçalarını sınıflar ve nesneler şeklinde organize etmek için kullanılır. 

Bu katmanlar genellikle, veritabanı erişimi, kullanıcı arayüzü, iş mantığı ve diğer işlevler gibi farklı sorumlulukları temsil eden sınıflardan oluşur. 
Object-oriented programlama, uygulamaların daha esnek, sürdürülebilir ve yeniden kullanılabilir olmasını sağlayan bir programlama paradigmadır.

### 2. Soru : Birbirinden bağımsız iki platformun birbiriyle haberleşmesi nasıl sağlanabilir. Örneğin, X platformu Java ile yazılmış olsun, Y platform u C# ile. Bu iki platformun bir biri ile iletişim halinde request-response ilişkisi kurması gerekiyor. Bu yapıyı nasıl sağlarız.

**Cevap**

Web servisleri, RESTful API veya SOAP API gibi iki ana tipte olabilir. RESTful API, basit HTTP protokolü üzerinden veri aktarımı sağlayan bir web servisi türüdür. 
SOAP API ise XML tabanlı bir protokol kullanarak veri aktarımı sağlar. 

Java ile yazılmış bir uygulama RESTful API veya SOAP API kullanarak veri paylaşımı sağlayabilir. 

C# ile yazılmış bir uygulama da aynı şekilde RESTful API veya SOAP API kullanarak veri paylaşımı sağlayabilir. 

Bu sayede, iki farklı platform arasında veri paylaşımı ve iletişim kurulabilir.

### 3. Soru : Bir web sayfasında ekran sürekli Backend’ den veya bir başka yapı tarafından güncelleniyor. Siz, web sayfasını refresh etmeden bu güncel bilgiyi anlık ekrana nasıl yansıtırsınız.

**Cevap** 

Soket bilgisayarlar arası veri haberleşmesinde kullanılır. Java ile bir web uygulaması oluşturabilir ve web sayfasında anlık olarak güncellenen bilgiyi göstermek için WebSocket teknolojisini kullanabilirsiniz. WebSocket, iki yönlü bir iletişim kanalı sağlayarak sunucu ve istemci arasında gerçek zamanlı veri alışverişi yapılmasını sağlar.  Örneğin, bir haber sitesinde anlık olarak yeni haberlerin eklendiği bir sayfada, sunucudan gönderilen verileri WebSocket ile alabilir ve anlık olarak sayfada gösterebilirsiniz.

### 4. Soru: Bir for döngüsü ile aşağıdaki çıktıyı yazar mısınız.

**Cevap** : 

````

class HelloWorld {
public static void main(String[] args) {

        for (int i = 1; i < 11; i += 2) {
            for (int j = 0; j < i; j++) {
               System.out.print("*");
            }
            System.out.println();
         }
    }

}

````



### 5. Soru: Firmada çalışman için sana remote bir linux server verildi. Elinde ip adresi port bilgisi kullanıcı adi ve şifren var. Server a erişimi nasıl test edersin, Server a nasıl erişirsin, Server a nasıl dosya atarsın, Serverdan nasıl dosya çekersin.

**Cevap** 

SSH, Secure Shell protokolünün kısaltmasıdır. Bir bilgisayar ile uzak bir bilgisayar arasında güvenli bir bağlantı kurulum yapılmasını sağlayan bir ağ protokolüdür. 
SSH protokolü ile birlikte bir kişi, bağlanacağı uzak sunucuya erişim sağlaması durumunda sunucu için de istediği şekilde yönetimi sağlayabilir.

SSH protokolü ile sunucuya bağlanmanız durumunda sunucu içerisindeki tüm dosya, uygulama gibi sunucunun tamamında bir yönetime sahip olursunuz.
Sunucuya dosya yüklemek için, "scp" komutunu kullanabilirsiniz. Örneğin, yerel bilgisayarınızdaki "ornek.txt" dosyasını sunucunun "/home/kullaniciadi/" 
dizinine yüklemek için aşağıdaki komutu kullanabilirsiniz:

```
scp ornek.txt kullaniciadi@ipadresi:/home/kullaniciadi/
```

Sunucudan dosya indirmek için de "scp" komutunu kullanabilirsiniz. Örneğin, 
sunucunun "/home/kullaniciadi/ornek.txt" dosyasını yerel bilgisayarınızdaki "/Users/kullaniciadi/" 
dizinine indirmek için aşağıdaki komutu kullanabilirsiniz:

```
scp kullaniciadi@ipadresi:/home/kullaniciadi/ornek.txt /Users/kullaniciadi/
```


### 6. Soru : Java spring uygulaması ile CRUD webservisi geliştirilmesi.

**Cevap :**

Tech Stack:

* [Spring Boot](#)  [Spring DataJpa](#)
* [H2 Database](#) [Git](#)
* [Java 8](#) [Docker](#)

### Project run

We can run two different ways:

### with Docker

```
docker run --name enoca-task -p 8080:8080 abbas1997/enoca
docker run --name enoca -p 8080:8080 abbas1997/enoca
```

### with Maven

1. go to this github adress git clone `https://github.com/AbbasSAFAROV/enoca-task`
2. `mvn clean install`
3. `mvn springboot:run`

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


### 7. Soru : Apache Solr servisine yazılacak bir query örneği Apache Solr kullanılan sql
   programlarından daha farklı runtime bir database. Solr a hali hazırda kayıtlı bir alan olduğunu
   düşünelim. Alanın ismi “updatedAt” long tipinde tutulan bir alan. Ben 2020 Ocak ayından
   sonraki verileri getir dediğimde solr a nasıl bir query yazılmalı. http://example?query=
   kısmını nasıl doldurmalıyım?

**Cevap**

`http://example?q=updatedAt:[2020-01-01T00:00:00Z TO *]&wt=json&indent=true`
